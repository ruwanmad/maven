/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zhub.servicemaster.views;

import com.zhub.servicemaster.data.SystemData;
import com.zhub.servicemaster.dialogs.ConfirmationDialog;
import com.zhub.servicemaster.guiFunctions.ButtonFunctions;
import com.zhub.servicemaster.internalFrames.BusinessPartnerFrame;
import com.zhub.servicemaster.models.Address;
import com.zhub.servicemaster.models.BusinessAddress;
import com.zhub.servicemaster.models.BusinessPartner;
import com.zhub.servicemaster.models.BusinessTelephone;
import com.zhub.servicemaster.models.TelephoneNumber;
import java.util.List;
import java.util.Set;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author RuwanM
 */
public class BusinessPatnerView extends javax.swing.JInternalFrame {

    private final List list;
    private final BusinessPartnerFrame businessPartnerFrame;

    /**
     * Creates new form CategoryView
     *
     * @param list
     * @param businessPatnerFrame
     */
    public BusinessPatnerView(List<BusinessPartner> list, BusinessPartnerFrame businessPatnerFrame) {
        initComponents();
        this.list = list;
        this.businessPartnerFrame = businessPatnerFrame;
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
        businessPartnerTable = new javax.swing.JTable();
        btnSelect = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();

        setTitle("Category View");
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

        businessPartnerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Bus. Par. Code", "First Name", "Last Name", "Is Customer", "Is Supplier", "Is Employee"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        businessPartnerTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                businessPartnerTableMouseClicked(evt);
            }
        });
        scrollPane.setViewportView(businessPartnerTable);

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
            .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 684, Short.MAX_VALUE)
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

        setBounds(0, 0, 700, 324);
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        if (!list.isEmpty()) {
            DefaultTableModel tableModel = (DefaultTableModel) businessPartnerTable.getModel();
            tableModel.setRowCount(0);
            for (Object object : list) {
                if (object instanceof BusinessPartner) {
                    BusinessPartner businessPartner = (BusinessPartner) object;
                    tableModel.addRow(new Object[]{businessPartner.getBusinessPartnerCode(), businessPartner.getFirstName(),
                        businessPartner.getLastName(), businessPartner.isIsCustomer(), businessPartner.isIsSupplier(), businessPartner.isIsEmployee()});
                }
            }
        }
    }//GEN-LAST:event_formInternalFrameOpened

    private void businessPartnerTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_businessPartnerTableMouseClicked
        int clickCount = evt.getClickCount();
        if (clickCount == 2) {
            this.selectBusinessPartner();
        }
    }//GEN-LAST:event_businessPartnerTableMouseClicked

    private void btnSelectMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSelectMouseEntered
        ButtonFunctions.changeBackgroundColor(evt.getSource(), SystemData.MOUSE_ENTER_COLOR);
    }//GEN-LAST:event_btnSelectMouseEntered

    private void btnSelectMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSelectMouseExited
        ButtonFunctions.changeBackgroundColor(evt.getSource(), SystemData.MOUSE_EXIT_COLOR);
    }//GEN-LAST:event_btnSelectMouseExited

    private void btnSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectActionPerformed
        this.selectBusinessPartner();
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

    private void selectBusinessPartner() {
        int selectedRow = businessPartnerTable.getSelectedRow();
        BusinessPartner businessPartner = (BusinessPartner) list.get(selectedRow);

        businessPartnerFrame.setBusinessPatnerCode(businessPartner.getBusinessPartnerCode());
        businessPartnerFrame.setFirstName(businessPartner.getFirstName());
        businessPartnerFrame.setLastName(businessPartner.getLastName());
        businessPartnerFrame.setNic(businessPartner.getNic());
        businessPartnerFrame.setBirthDay(businessPartner.getBirthDay());
        businessPartnerFrame.setIsCustomer(businessPartner.isIsCustomer());
        businessPartnerFrame.setIsSupplier(businessPartner.isIsSupplier());
        businessPartnerFrame.setIsEmployee(businessPartner.isIsEmployee());
        businessPartnerFrame.setIsActive((businessPartner.getIsActive() == 1));
        businessPartnerFrame.setRemark(businessPartner.getRemarks());

        Set addresses = businessPartner.getBusinessAddresses();
        if (!addresses.isEmpty()) {
            for (Object object : addresses) {
                if (object instanceof BusinessAddress) {
                    BusinessAddress businessAddress = (BusinessAddress) object;
                    Address address = businessAddress.getAddress();
                    businessPartnerFrame.setAddressLine1(address.getAddressCode() + "-" + address.getAdressLine1());
                    businessPartnerFrame.setAddressLine2(address.getAdressLine2());
                    businessPartnerFrame.setAddressLine3(address.getAdressLine3());
                }
            }
        }
        Set telephoneNumbers = businessPartner.getBusinessTelephones();
        if (!telephoneNumbers.isEmpty()) {
            for (Object object : telephoneNumbers) {
                if (object instanceof BusinessTelephone) {
                    BusinessTelephone businessTelephone = (BusinessTelephone) object;
                    TelephoneNumber telephoneNumber = businessTelephone.getTelephoneNumber();
                    businessPartnerFrame.setTelephoneNumber(telephoneNumber.getTelephoneNumberCode() + "-" + telephoneNumber.getTelephoneNumber());
                }
            }
        }
        businessPartnerFrame.setBusinessPatnerCodeEditable(false);
        businessPartnerFrame.setNicEditable(true);
        businessPartnerFrame.setBtnSaveText("Update");
        this.dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnSelect;
    private javax.swing.JTable businessPartnerTable;
    private javax.swing.JScrollPane scrollPane;
    // End of variables declaration//GEN-END:variables
}
