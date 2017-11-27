/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zhub.servicemaster.views;

import com.zhub.servicemaster.data.SystemData;
import com.zhub.servicemaster.dialogs.ConfirmationDialog;
import com.zhub.servicemaster.guiFunctions.ButtonFunctions;
import com.zhub.servicemaster.internalFrames.BomFrame;
import com.zhub.servicemaster.models.Bom;
import com.zhub.servicemaster.models.BomItem;
import com.zhub.servicemaster.models.Item;
import com.zhub.servicemaster.utils.HibernateUtil;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author RuwanM
 */
public class BomView extends javax.swing.JInternalFrame {

    private final List list;
    private final BomFrame bomFrame;

    /**
     * Creates new form CategoryView
     *
     * @param list
     * @param bomFrame
     */
    public BomView(List<Item> list, BomFrame bomFrame) {
        initComponents();
        this.list = list;
        this.bomFrame = bomFrame;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollPane = new javax.swing.JScrollPane();
        bomTable = new javax.swing.JTable();
        btnSelect = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();

        setTitle("BOM View");
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

        bomTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Bom Code", "Item Name", "Remark", "Is Active"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        bomTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bomTableMouseClicked(evt);
            }
        });
        scrollPane.setViewportView(bomTable);
        if (bomTable.getColumnModel().getColumnCount() > 0) {
            bomTable.getColumnModel().getColumn(1).setResizable(false);
            bomTable.getColumnModel().getColumn(1).setPreferredWidth(200);
        }

        btnSelect.setBackground(new java.awt.Color(150, 255, 150));
        btnSelect.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnSelect.setText("Select");
        btnSelect.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(50, 255, 50)));
        btnSelect.setContentAreaFilled(false);
        btnSelect.setOpaque(true);
        btnSelect.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSelectMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSelectMouseExited(evt);
            }
        });
        btnSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnClose, btnSelect});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnClose, btnSelect});

        setBounds(0, 0, 566, 324);
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        if (!list.isEmpty()) {
            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();

            DefaultTableModel tableModel = (DefaultTableModel) bomTable.getModel();
            tableModel.setRowCount(0);
            for (Object object : list) {
                if (object instanceof Bom) {
                    Bom bom = (Bom) object;
                    Item item = (Item) session.createCriteria(Item.class)
                            .add(Restrictions.eq("itemCode", bom.getItem().getItemCode()))
                            .uniqueResult();
                    tableModel.addRow(new Object[]{bom.getBomCode(), item.getItemName(), bom.getRemark(), bom.getIsActive() == 1});
                }
            }

            transaction.commit();
            session.close();
        }
    }//GEN-LAST:event_formInternalFrameOpened

    private void bomTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bomTableMouseClicked
        int clickCount = evt.getClickCount();
        if (clickCount == 2) {
            this.selectBom();
        }
    }//GEN-LAST:event_bomTableMouseClicked

    private void btnSelectMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSelectMouseEntered
        ButtonFunctions.changeBackgroundColor(evt.getSource(), SystemData.MOUSE_ENTER_COLOR);
    }//GEN-LAST:event_btnSelectMouseEntered

    private void btnSelectMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSelectMouseExited
        ButtonFunctions.changeBackgroundColor(evt.getSource(), SystemData.MOUSE_EXIT_COLOR);
    }//GEN-LAST:event_btnSelectMouseExited

    private void btnSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectActionPerformed
        this.selectBom();
    }//GEN-LAST:event_btnSelectActionPerformed

    private void btnCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseEntered
        ButtonFunctions.changeBackgroundColor(evt.getSource(), SystemData.MOUSE_ENTER_COLOR);
    }//GEN-LAST:event_btnCloseMouseEntered

    private void btnCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseExited
        ButtonFunctions.changeBackgroundColor(evt.getSource(), SystemData.MOUSE_EXIT_COLOR);
    }//GEN-LAST:event_btnCloseMouseExited

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        ConfirmationDialog.showMessageBox("Are you sure?", "Sure", this);
        if (ConfirmationDialog.option == ConfirmationDialog.YES_OPTION) {
            this.dispose();
        }
    }//GEN-LAST:event_btnCloseActionPerformed

    private void selectBom() {
        int selectedRow = bomTable.getSelectedRow();
        Bom bom = (Bom) list.get(selectedRow);

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        Item item = (Item) session
                .createCriteria(Item.class)
                .add(Restrictions.eq("itemCode", bom.getItem().getItemCode()))
                .uniqueResult();

        List<BomItem> bomItems = session
                .createCriteria(BomItem.class)
                .add(Restrictions.eq("bom.bomCode", bom.getBomCode()))
                .list();

        transaction.commit();
        session.close();

        bomFrame.setBomCode(bom.getBomCode());
        bomFrame.setBomSellingPrice(bom.getSellingPrice());
        bomFrame.setMainItem(item.getItemName());
        bomFrame.setRemark(bom.getRemark());
        bomFrame.setIsActive(bom.getIsActive() == 1);
        bomFrame.setAddedItems(bomItems);
        bomFrame.setBomCodeEditable(false);
        bomFrame.setMainItemEditable(false);
        bomFrame.setBtnSaveText("Update");
        this.dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable bomTable;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnSelect;
    private javax.swing.JScrollPane scrollPane;
    // End of variables declaration//GEN-END:variables
}