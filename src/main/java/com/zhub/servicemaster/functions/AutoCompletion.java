/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zhub.servicemaster.functions;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.ComboBoxEditor;
import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.SwingUtilities;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.JTextComponent;
import javax.swing.text.PlainDocument;

/**
 *
 * @author RuwanM
 */
public class AutoCompletion extends PlainDocument {

    ComboBoxModel model;
    JTextComponent editor;
    Component nextFocusable;

    boolean selecting = false;
    boolean hidePopupOnFocusLoss;
    boolean hitBackspace = false;
    boolean hitBackspaceOnSelection;

    KeyListener editorKeyListener;
    FocusListener editorFocusListener;

    private final JComboBox comboBox;

    public AutoCompletion(final JComboBox comboBox, final Component nextFocusable) {
        this.comboBox = comboBox;
        this.nextFocusable = nextFocusable;
        model = comboBox.getModel();
        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!selecting) {
                    highlightCompletedText(0);
                }
            }
        });
        comboBox.addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent e) {
                if (e.getPropertyName().equals("editor")) {
                    configureEditor((ComboBoxEditor) e.getNewValue());
                }
                if (e.getPropertyName().equals("model")) {
                    model = (ComboBoxModel) e.getNewValue();
                }
            }
        });

        editorKeyListener = new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (!isFunctionKey(e.getKeyCode())) {
                    if (comboBox.isDisplayable()) {
                        comboBox.setPopupVisible(true);
                    }
                    hitBackspace = false;
                    switch (e.getKeyCode()) {
                        case KeyEvent.VK_BACK_SPACE:
                            hitBackspace = true;
                            hitBackspaceOnSelection = editor.getSelectionStart() != editor.getSelectionEnd();
                            break;
                        case KeyEvent.VK_DELETE:
                            e.consume();
                            comboBox.getToolkit().beep();
                            break;
                        case KeyEvent.VK_ENTER:
                            if (!editor.getText().isEmpty()) {
                                SwingUtilities.invokeLater(new Runnable() {
                                    @Override
                                    public void run() {
                                        nextFocusable.requestFocus();
                                    }
                                });
                            }
                            break;
                    }
                }
            }
        };

        hidePopupOnFocusLoss = System.getProperty("java.version").startsWith("1.5");
        editorFocusListener = new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                highlightCompletedText(0);
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (hidePopupOnFocusLoss) {
                    comboBox.setPopupVisible(false);
                }
            }
        };

        configureEditor(comboBox.getEditor());
        Object selected = comboBox.getSelectedItem();
        if (selected != null) {
            setText(selected.toString());
        }
        highlightCompletedText(0);
    }

    public static void enable(JComboBox comboBox, Component nextFocusable) {
        comboBox.setEditable(true);
        new AutoCompletion(comboBox, nextFocusable);
    }

    final void configureEditor(ComboBoxEditor newEditor) {
        if (editor != null) {
            editor.removeKeyListener(editorKeyListener);
            editor.removeFocusListener(editorFocusListener);
        }

        if (newEditor != null) {
            editor = (JTextComponent) newEditor.getEditorComponent();
            editor.addKeyListener(editorKeyListener);
            editor.addFocusListener(editorFocusListener);
            editor.setDocument(this);
        }
    }

    @Override
    public void remove(int offs, int len) throws BadLocationException {
        if (selecting) {
            return;
        }
        if (hitBackspace) {
            if (offs > 0) {
                if (hitBackspaceOnSelection) {
                    offs--;
                }
            } else {
                comboBox.getToolkit().beep();
            }
            highlightCompletedText(offs);
        } else {
            super.remove(offs, len);
        }
    }

    @Override
    public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
        if (selecting) {
            return;
        }

        super.insertString(offs, str, a);

        Object item = lookupItem(getText(0, getLength()));
        if (item != null) {
            setSelectedItem(item);
        } else {
            item = comboBox.getSelectedItem();
            offs = offs - str.length();
            comboBox.getToolkit().beep();
        }
        setText(item.toString());
        highlightCompletedText(offs + str.length());
    }

    private void setText(String text) {
        try {
            super.remove(0, getLength());
            super.insertString(0, text, null);
        } catch (BadLocationException e) {
            throw new RuntimeException(e.toString());
        }
    }

    private void highlightCompletedText(int start) {
        editor.setCaretPosition(getLength());
        editor.moveCaretPosition(start);
    }

    private void setSelectedItem(Object item) {
        selecting = true;
        model.setSelectedItem(item);
        selecting = false;
    }

    private Object lookupItem(String pattern) {
        Object selectedItem = model.getSelectedItem();
        if (selectedItem != null && startsWithIgnoreCase(selectedItem.toString(), pattern)) {
            return selectedItem;
        } else {
            for (int i = 0, n = model.getSize(); i < n; i++) {
                Object currentItem = model.getElementAt(i);
                if (currentItem != null && startsWithIgnoreCase(currentItem.toString(), pattern)) {
                    return currentItem;
                }
            }
        }
        return null;
    }

    private boolean startsWithIgnoreCase(String str1, String str2) {
        return str1.toUpperCase().startsWith(str2.toUpperCase());
    }

    private boolean isFunctionKey(int keyCode) {
        
        return keyCode == KeyEvent.VK_F1 
                || keyCode == KeyEvent.VK_F2
                || keyCode == KeyEvent.VK_F3
                || keyCode == KeyEvent.VK_F4 
                || keyCode == KeyEvent.VK_F5
                || keyCode == KeyEvent.VK_F6
                || keyCode == KeyEvent.VK_F7
                || keyCode == KeyEvent.VK_F8
                || keyCode == KeyEvent.VK_F9
                || keyCode == KeyEvent.VK_F10
                || keyCode == KeyEvent.VK_F11
                || keyCode == KeyEvent.VK_F12;
    }
}
