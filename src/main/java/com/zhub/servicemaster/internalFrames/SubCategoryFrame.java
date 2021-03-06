/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zhub.servicemaster.internalFrames;

import com.zhub.servicemaster.data.SystemData;
import com.zhub.servicemaster.dialogs.ConfirmationDialog;
import com.zhub.servicemaster.dialogs.InformationDialog;
import com.zhub.servicemaster.forms.MainFrame;
import com.zhub.servicemaster.guiFunctions.ButtonFunctions;
import com.zhub.servicemaster.keys.KeyCodeFunctions;
import com.zhub.servicemaster.models.Category;
import com.zhub.servicemaster.models.Printer;
import com.zhub.servicemaster.models.SubCategory;
import com.zhub.servicemaster.utils.HibernateUtil;
import com.zhub.servicemaster.views.SubCategoryView;
import java.util.Date;
import java.util.List;
import java.util.TreeMap;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author RuwanM
 */
public class SubCategoryFrame extends javax.swing.JInternalFrame {

    /**
     * Creates new form SubCategory
     */
    public SubCategoryFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtSubcategoryCode = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cmbCategory = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtSubcategoryName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtRemark = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cbxIsActive = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        cmbPrinter = new javax.swing.JComboBox<>();
        btnReset = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        btnCodeSerach = new javax.swing.JButton();
        btnNameSearch = new javax.swing.JButton();

        setTitle("Sub category");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel1.setText("Sub category code :");

        txtSubcategoryCode.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel2.setText("Category code :");

        cmbCategory.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        cmbCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select--" }));

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel3.setText("Sub category name :");

        txtSubcategoryName.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel4.setText("Remark :");

        txtRemark.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel5.setText("Is Active :");

        cbxIsActive.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        cbxIsActive.setSelected(true);

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel7.setText("Printer :");

        cmbPrinter.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        cmbPrinter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select--" }));

        btnReset.setBackground(new java.awt.Color(150, 255, 150));
        btnReset.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnReset.setText("Reset");
        btnReset.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(50, 255, 50)));
        btnReset.setContentAreaFilled(false);
        btnReset.setOpaque(true);
        btnReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnResetMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnResetMouseExited(evt);
            }
        });
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnSave.setBackground(new java.awt.Color(150, 255, 150));
        btnSave.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnSave.setText("Save");
        btnSave.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(50, 255, 50)));
        btnSave.setContentAreaFilled(false);
        btnSave.setOpaque(true);
        btnSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSaveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSaveMouseExited(evt);
            }
        });
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnClose.setBackground(new java.awt.Color(150, 255, 150));
        btnClose.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnClose.setText("Close");
        btnClose.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(50, 255, 50)));
        btnClose.setContentAreaFilled(false);
        btnClose.setOpaque(true);
        btnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCloseMouseExited(evt);
            }
        });
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        btnCodeSerach.setBackground(new java.awt.Color(150, 255, 150));
        btnCodeSerach.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnCodeSerach.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/search.png"))); // NOI18N
        btnCodeSerach.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(50, 255, 50)));
        btnCodeSerach.setContentAreaFilled(false);
        btnCodeSerach.setOpaque(true);
        btnCodeSerach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCodeSerachMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCodeSerachMouseExited(evt);
            }
        });
        btnCodeSerach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCodeSerachActionPerformed(evt);
            }
        });

        btnNameSearch.setBackground(new java.awt.Color(150, 255, 150));
        btnNameSearch.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnNameSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/search.png"))); // NOI18N
        btnNameSearch.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(50, 255, 50)));
        btnNameSearch.setContentAreaFilled(false);
        btnNameSearch.setOpaque(true);
        btnNameSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNameSearchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNameSearchMouseExited(evt);
            }
        });
        btnNameSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNameSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtSubcategoryCode, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(4, 4, 4)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnCodeSerach, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnNameSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(cmbCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbxIsActive)
                                    .addComponent(txtRemark, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(10, 10, 10)
                                .addComponent(txtSubcategoryName, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmbPrinter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel2, jLabel3, jLabel4, jLabel5, jLabel7});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtSubcategoryCode, txtSubcategoryName});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cmbCategory, cmbPrinter, txtRemark});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnClose, btnReset, btnSave});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCodeSerach, btnNameSearch});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtSubcategoryCode, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtSubcategoryName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCodeSerach, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNameSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cmbPrinter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtRemark, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxIsActive)
                    .addComponent(jLabel5))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cbxIsActive, cmbCategory, cmbPrinter, jLabel1, jLabel2, jLabel3, jLabel4, jLabel5, jLabel7, txtRemark, txtSubcategoryCode, txtSubcategoryName});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnClose, btnReset, btnSave});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnCodeSerach, btnNameSearch});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Query query = session.createQuery("from Category c order by c.categoryCode");
        List list = query.list();
        if (!list.isEmpty()) {
            for (Object object : list) {
                if (object instanceof Category) {
                    Category category = (Category) object;
                    String categoryName = category.getCategoryName();
                    String catecoryCode = category.getCategoryCode();
                    cmbCategory.addItem(catecoryCode + "-" + categoryName);
                    this.categoryMap.put(catecoryCode, category);
                }
            }
        }

        query = session.createQuery("from Printer p order by p.printerCode");
        list = query.list();
        if (!list.isEmpty()) {
            for (Object object : list) {
                if (object instanceof Printer) {
                    Printer printer = (Printer) object;
                    String printerCode = printer.getPrinterCode();
                    String printerName = printer.getPrinterName();
                    cmbPrinter.addItem(printerCode + "-" + printerName);
                    this.printerMap.put(printerCode, printer);
                }
            }
        }

        session.getTransaction().commit();
        session.close();
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnResetMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResetMouseEntered
        ButtonFunctions.changeBackgroundColor(evt.getSource(), SystemData.MOUSE_ENTER_COLOR);
    }//GEN-LAST:event_btnResetMouseEntered

    private void btnResetMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResetMouseExited
        ButtonFunctions.changeBackgroundColor(evt.getSource(), SystemData.MOUSE_EXIT_COLOR);
    }//GEN-LAST:event_btnResetMouseExited

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        this.clearAll();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnSaveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseEntered
        ButtonFunctions.changeBackgroundColor(evt.getSource(), SystemData.MOUSE_ENTER_COLOR);
    }//GEN-LAST:event_btnSaveMouseEntered

    private void btnSaveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseExited
        ButtonFunctions.changeBackgroundColor(evt.getSource(), SystemData.MOUSE_EXIT_COLOR);
    }//GEN-LAST:event_btnSaveMouseExited

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if (txtSubcategoryCode.getText().toUpperCase().trim().isEmpty()) {
            List subCategories = this.getSubCategoryByName(txtSubcategoryName.getText().toUpperCase().trim(), false);
            if (subCategories.size() > 0) {
                InformationDialog.showMessageBox("Item name already exists.", "Exist", this);
            } else {
                if (((String) cmbCategory.getSelectedItem()).trim().equalsIgnoreCase(SystemData.COMBO_DEFAULT)) {
                    InformationDialog.showMessageBox("Please select a valid category and type", "Invalid", this);
                } else {
                    KeyCodeFunctions keyCodeFunctions = new KeyCodeFunctions();
                    this.saveOrUpdateSubCategory(keyCodeFunctions.getKey("SUB", "Sub Category"), false);
                }
            }
        } else {
            List subCategories = this.getSubCategoryByCode(txtSubcategoryCode.getText().toUpperCase().trim(), false);
            if (subCategories.isEmpty()) {
                InformationDialog.showMessageBox("Invalid sub category code. Please try again", "Invalid", this);
            } else {
                ConfirmationDialog.showMessageBox("Do you want to update?", "Update", this);
                if (ConfirmationDialog.option == ConfirmationDialog.YES_OPTION) {
                    if (((String) cmbCategory.getSelectedItem()).trim().equalsIgnoreCase(SystemData.COMBO_DEFAULT)) {
                        InformationDialog.showMessageBox("Please select a valid category and type", "Invalid", this);
                    } else {
                        this.saveOrUpdateSubCategory(txtSubcategoryCode.getText().toUpperCase().trim(), true);
                    }
                }
            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseEntered
        ButtonFunctions.changeBackgroundColor(evt.getSource(), SystemData.MOUSE_ENTER_COLOR);
    }//GEN-LAST:event_btnCloseMouseEntered

    private void btnCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseExited
        ButtonFunctions.changeBackgroundColor(evt.getSource(), SystemData.MOUSE_EXIT_COLOR);
    }//GEN-LAST:event_btnCloseMouseExited

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnCodeSerachMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCodeSerachMouseEntered
        ButtonFunctions.changeBackgroundColor(evt.getSource(), SystemData.MOUSE_ENTER_COLOR);
    }//GEN-LAST:event_btnCodeSerachMouseEntered

    private void btnCodeSerachMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCodeSerachMouseExited
        ButtonFunctions.changeBackgroundColor(evt.getSource(), SystemData.MOUSE_EXIT_COLOR);
    }//GEN-LAST:event_btnCodeSerachMouseExited

    private void btnCodeSerachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCodeSerachActionPerformed
        String subCategoryCode = txtSubcategoryCode.getText().trim();

        List subCategories = getSubCategoryByCode(subCategoryCode, true);
        if (!subCategories.isEmpty()) {
            SubCategoryView subCategoryView = new SubCategoryView(subCategories, this);
            MainFrame.desktopPane.add(subCategoryView);
            subCategoryView.setVisible(true);
        }
    }//GEN-LAST:event_btnCodeSerachActionPerformed

    private void btnNameSearchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNameSearchMouseEntered
        ButtonFunctions.changeBackgroundColor(evt.getSource(), SystemData.MOUSE_ENTER_COLOR);
    }//GEN-LAST:event_btnNameSearchMouseEntered

    private void btnNameSearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNameSearchMouseExited
        ButtonFunctions.changeBackgroundColor(evt.getSource(), SystemData.MOUSE_EXIT_COLOR);
    }//GEN-LAST:event_btnNameSearchMouseExited

    private void btnNameSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNameSearchActionPerformed
        String subCategoryName = txtSubcategoryName.getText().trim();
        List subCategories = getSubCategoryByName(subCategoryName, true);

        if (subCategories.size() > 0) {
            SubCategoryView subCategoryView = new SubCategoryView(subCategories, this);
            MainFrame.desktopPane.add(subCategoryView);
            subCategoryView.setVisible(true);
        }
    }//GEN-LAST:event_btnNameSearchActionPerformed

    public void setSubcategoryCode(String subCategoryCode) {
        this.txtSubcategoryCode.setText(subCategoryCode);
    }

    public void setSubcategoryName(String subCategoryName) {
        this.txtSubcategoryName.setText(subCategoryName);
    }

    public void setCategory(String category) {
        Category cat = this.categoryMap.get(category);
        this.cmbCategory.setSelectedItem(cat.getCategoryCode() + "-" + cat.getCategoryName());
    }

    public void setPrinter(String printer) {
        Printer prin = this.printerMap.get(printer);
        this.cmbPrinter.setSelectedItem(prin.getPrinterCode() + "-" + prin.getPrinterName());
    }

    public void setIsActive(boolean isActive) {
        this.cbxIsActive.setSelected(isActive);
    }

    public void setSubCategoryCodeEditable(boolean editable) {
        txtSubcategoryCode.setEditable(editable);
    }

    public void setRemark(String remark) {
        this.txtRemark.setText(remark);
    }

    public void setBtnSaveText(String text) {
        this.btnSave.setText(text);
    }

    private List getSubCategoryByCode(String subCategoryCode, boolean like) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        Criteria itemTypeCriteria = session.createCriteria(SubCategory.class);
        if (like) {
            itemTypeCriteria.add(Restrictions.like("subCategoryCode", "%" + subCategoryCode + "%"));
            itemTypeCriteria.addOrder(Order.asc("subCategoryCode"));
        } else {
            itemTypeCriteria.add(Restrictions.eq("subCategoryCode", subCategoryCode));
            itemTypeCriteria.addOrder(Order.asc("subCategoryCode"));
        }
        List list = itemTypeCriteria.list();
        session.close();
        return list;
    }

    private List getSubCategoryByName(String subCategoryName, boolean like) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        Criteria itemTypeCriteria = session.createCriteria(SubCategory.class);
        if (like) {
            itemTypeCriteria.add(Restrictions.like("subCategoryName", "%" + subCategoryName + "%"));
            itemTypeCriteria.addOrder(Order.asc("subCategoryCode"));
        } else {
            itemTypeCriteria.add(Restrictions.eq("subCategoryName", subCategoryName));
            itemTypeCriteria.addOrder(Order.asc("subCategoryCode"));
        }
        List list = itemTypeCriteria.list();
        session.close();
        return list;
    }

    private void clearAll() {
        txtSubcategoryCode.setText("");
        txtSubcategoryName.setText("");
        txtRemark.setText("");
        cbxIsActive.setSelected(true);
        txtSubcategoryCode.setEditable(true);
        cmbCategory.setSelectedIndex(0);
        cmbPrinter.setSelectedIndex(0);
    }

    private void saveOrUpdateSubCategory(String strSubCategoryCode, boolean bUpdate) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Category category = (Category) session.createCriteria(Category.class)
                .add(Restrictions.eq("categoryCode", (((String) cmbCategory.getSelectedItem())).split("-")[0].trim()))
                .uniqueResult();

        Printer printer = (Printer) session.createCriteria(Printer.class)
                .add(Restrictions.eq("printerCode", (((String) cmbPrinter.getSelectedItem())).split("-")[0].trim()))
                .uniqueResult();

        SubCategory subCategory = new SubCategory();
        subCategory.setSubCategoryCode(strSubCategoryCode);
        subCategory.setSubCategoryName(txtSubcategoryName.getText().toUpperCase().trim());
        subCategory.setCategoryCode(category.getCategoryCode());
        subCategory.setPrinterCode(printer.getPrinterCode());
        subCategory.setRemarks(txtRemark.getText().toUpperCase().trim());
        subCategory.setIsActive(cbxIsActive.isSelected() ? 1 : 0);
        if (bUpdate) {
            subCategory.setModifiedDate(new Date());
            subCategory.setModifiedTime(new Date());
            subCategory.setModifiedUser(MainFrame.user.getUserId());
        } else {
            subCategory.setCreatedDate(new Date());
            subCategory.setCreatedTime(new Date());
            subCategory.setCreatedUser(MainFrame.user.getUserId());
        }
        session.saveOrUpdate(subCategory);

        session.getTransaction().commit();
        session.close();

        if (bUpdate) {
            InformationDialog.showMessageBox("Successfully updated", "Success", this);
        } else {
            InformationDialog.showMessageBox("New entry created successfully", "Success", this);
        }
        this.clearAll();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnCodeSerach;
    private javax.swing.JButton btnNameSearch;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSave;
    private javax.swing.JCheckBox cbxIsActive;
    private javax.swing.JComboBox<String> cmbCategory;
    private javax.swing.JComboBox<String> cmbPrinter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtRemark;
    private javax.swing.JTextField txtSubcategoryCode;
    private javax.swing.JTextField txtSubcategoryName;
    // End of variables declaration//GEN-END:variables
    private final TreeMap<String, Category> categoryMap = new TreeMap<>();
    private final TreeMap<String, Printer> printerMap = new TreeMap<>();
}
