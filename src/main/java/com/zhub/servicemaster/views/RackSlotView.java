/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zhub.servicemaster.views;

import com.zhub.servicemaster.data.SystemData;
import com.zhub.servicemaster.dialogs.ConfirmationDialog;
import com.zhub.servicemaster.guiFunctions.ButtonFunctions;
import com.zhub.servicemaster.internalFrames.RackSlotFrame;
import com.zhub.servicemaster.models.Rack;
import com.zhub.servicemaster.models.RackSlot;
import com.zhub.servicemaster.models.Storage;
import com.zhub.servicemaster.utils.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author RuwanM
 */
public class RackSlotView extends javax.swing.JInternalFrame {

    private final List list;
    private final RackSlotFrame rackSlotFrame;

    /**
     * Creates new form CategoryView
     *
     * @param list
     * @param rackSlotFrame
     */
    public RackSlotView(List<RackSlot> list, RackSlotFrame rackSlotFrame) {
        initComponents();
        this.list = list;
        this.rackSlotFrame = rackSlotFrame;
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
        rackSlotTable = new javax.swing.JTable();
        btnSelect = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();

        setTitle("Rack Slot View");
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

        rackSlotTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Slot Code", "Slot Name", "Storage Code", "Rack Code", "Remark", "Is Active"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
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
        rackSlotTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rackSlotTableMouseClicked(evt);
            }
        });
        scrollPane.setViewportView(rackSlotTable);

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
            .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 772, Short.MAX_VALUE)
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

        setBounds(0, 0, 788, 324);
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        if (!list.isEmpty()) {
            DefaultTableModel tableModel = (DefaultTableModel) rackSlotTable.getModel();
            tableModel.setRowCount(0);
            for (Object object : list) {
                if (object instanceof RackSlot) {
                    RackSlot rackSlot = (RackSlot) object;

                    Session session = HibernateUtil.getSessionFactory().openSession();
                    session.beginTransaction();

                    Query query = session.createQuery("from Rack r join fetch r.storage where r.rackCode like :code");
                    query.setParameter("code", "%" + rackSlot.getRack().getRackCode() + "%");

                    Storage storage = null;

                    List racks = query.list();
                    if (!racks.isEmpty()) {
                        for (Object rack : racks) {
                            if (rack instanceof Rack) {
                                Rack r = (Rack) rack;
                                storage = r.getStorage();
                            }
                        }
                    }

                    if (storage == null) {
                        tableModel.addRow(new Object[]{rackSlot.getRackSlotCode(),
                            rackSlot.getRackSlotName(),
                            "No storage",
                            rackSlot.getRack().getRackCode(),
                            rackSlot.getRemark(),
                            rackSlot.getIsActive() == 1});
                    } else {
                        tableModel.addRow(new Object[]{rackSlot.getRackSlotCode(),
                            rackSlot.getRackSlotName(),
                            storage.getStorageCode(),
                            rackSlot.getRack().getRackCode(),
                            rackSlot.getRemark(),
                            rackSlot.getIsActive() == 1});
                        this.storages.add(storage);
                    }
                }
            }
        }
    }//GEN-LAST:event_formInternalFrameOpened

    private void rackSlotTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rackSlotTableMouseClicked
        int clickCount = evt.getClickCount();
        if (clickCount == 2) {
            this.selectRackSlot();
        }
    }//GEN-LAST:event_rackSlotTableMouseClicked

    private void btnSelectMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSelectMouseEntered
        ButtonFunctions.changeBackgroundColor(evt.getSource(), SystemData.MOUSE_ENTER_COLOR);
    }//GEN-LAST:event_btnSelectMouseEntered

    private void btnSelectMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSelectMouseExited
        ButtonFunctions.changeBackgroundColor(evt.getSource(), SystemData.MOUSE_EXIT_COLOR);
    }//GEN-LAST:event_btnSelectMouseExited

    private void btnSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectActionPerformed
        this.selectRackSlot();
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

    private void selectRackSlot() {
        int selectedRow = rackSlotTable.getSelectedRow();
        Storage storage = this.storages.get(selectedRow);
        RackSlot rackSlot = (RackSlot) list.get(selectedRow);
        rackSlotFrame.setRackSlotCode(rackSlot.getRackSlotCode());
        rackSlotFrame.setRackSlotName(rackSlot.getRackSlotName());
        rackSlotFrame.setRemark(rackSlot.getRemark());
        rackSlotFrame.setIsActive((rackSlot.getIsActive() == 1));
        rackSlotFrame.setStorage(storage.getStorageCode());
        rackSlotFrame.setRack(rackSlot.getRack().getRackCode());
        rackSlotFrame.setRackSlotCodeEditable(false);
        rackSlotFrame.setBtnSaveText("Update");
        this.dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnSelect;
    private javax.swing.JTable rackSlotTable;
    private javax.swing.JScrollPane scrollPane;
    // End of variables declaration//GEN-END:variables
    ArrayList<Storage> storages = new ArrayList<>();
}