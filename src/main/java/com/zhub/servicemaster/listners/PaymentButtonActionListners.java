/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zhub.servicemaster.listners;

import com.zhub.servicemaster.dialogs.SettlementDialog;
import com.zhub.servicemaster.models.BusinessPartner;
import com.zhub.servicemaster.models.Invoice;
import com.zhub.servicemaster.models.Payment;
import com.zhub.servicemaster.models.Sale;
import com.zhub.servicemaster.models.Vehicle;
import com.zhub.servicemaster.panel.CashSettlePanel;
import com.zhub.servicemaster.panel.ChequeSettlePanel;
import com.zhub.servicemaster.panel.CreditCardSettlePanel;
import com.zhub.servicemaster.panel.CreditSettlePanel;
import com.zhub.servicemaster.utils.HibernateUtil;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JButton;
import javax.swing.SwingUtilities;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author RuwanM
 */
public class PaymentButtonActionListners implements ActionListener {

    private final SettlementDialog settlementDialog;
    private Sale sale;
    private final Invoice invoice;

    public PaymentButtonActionListners(SettlementDialog settlementDialog, Sale sale, Invoice invoice) {
        this.settlementDialog = settlementDialog;
        this.sale = sale;
        this.invoice = invoice;
    }

    @Override
    public void actionPerformed(ActionEvent evt) {
        Object object = evt.getSource();
        if (object instanceof JButton) {
            JButton button = (JButton) object;
            String name = button.getName();

            button.removeFocusListener(new PaymentButtonFocusListner());
            if (name.equalsIgnoreCase("PTY1000")) { // Cash Settlements
                settlementDialog.panelWindow.removeAll();

                final CashSettlePanel cashSettlePanel = new CashSettlePanel(this.settlementDialog, "PTY1000");
                settlementDialog.panelFrame = cashSettlePanel;
                settlementDialog.panelWindow.add(settlementDialog.panelFrame);
                settlementDialog.panelWindow.revalidate();
                settlementDialog.panelWindow.repaint();
                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        cashSettlePanel.txtNowPaying.requestFocus();
                    }
                });

                Session session = HibernateUtil.getSessionFactory().openSession();
                Transaction transaction = session.beginTransaction();

                sale = (Sale) session.load(Sale.class, sale.getSaleCode());

                List<Payment> payments = session
                        .createCriteria(Payment.class)
                        .add(Restrictions.eq("invoice", this.invoice))
                        .list();

                if (payments.isEmpty()) {
                    cashSettlePanel.txtTotalAmount.setText("" + sale.getGrandTotal());
                    cashSettlePanel.txtRemainingBalance.setText("" + sale.getGrandTotal());
                    cashSettlePanel.txtNowPaying.setText("" + sale.getGrandTotal());
                } else {
                    float paidAmount = 0.0f;
                    for (Payment payment : payments) {
                        paidAmount += payment.getAmount();
                    }
                    cashSettlePanel.txtTotalAmount.setText("" + sale.getGrandTotal());
                    cashSettlePanel.txtPaidAmount.setText("" + paidAmount);
                    cashSettlePanel.txtRemainingBalance.setText("" + (sale.getGrandTotal() - paidAmount));
                    cashSettlePanel.txtNowPaying.setText("" + (sale.getGrandTotal() - paidAmount));
                }

                transaction.commit();
                session.close();
            } else if (name.equalsIgnoreCase("PTY1001")) { // Cheque Settlements
                settlementDialog.panelWindow.removeAll();

                final ChequeSettlePanel chequeSettlePanel = new ChequeSettlePanel(this.settlementDialog, "PTY1001");
                settlementDialog.panelFrame = chequeSettlePanel;
                settlementDialog.panelWindow.add(settlementDialog.panelFrame);
                settlementDialog.panelWindow.revalidate();
                settlementDialog.panelWindow.repaint();
                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        chequeSettlePanel.txtNowPaying.requestFocus();
                    }
                });

                Session session = HibernateUtil.getSessionFactory().openSession();
                Transaction transaction = session.beginTransaction();

                sale = (Sale) session.load(Sale.class, sale.getSaleCode());

                List<Payment> payments = session
                        .createCriteria(Payment.class)
                        .add(Restrictions.eq("invoice", this.invoice))
                        .list();

                Vehicle vehicle = (Vehicle) session.load(Vehicle.class, sale.getVehicle().getVehicleCode());

                BusinessPartner businessPartner = (BusinessPartner) session
                        .createCriteria(BusinessPartner.class)
                        .add(Restrictions.eq("businessPartnerCode", vehicle.getBusinessPartner().getBusinessPartnerCode()))
                        .uniqueResult();

                if (businessPartner != null) {
                    chequeSettlePanel.cmbCustomer.setSelectedItem(businessPartner.getFirstName() + " " + businessPartner.getLastName());
                }

                if (payments.isEmpty()) {
                    chequeSettlePanel.txtTotalAmount.setText("" + sale.getGrandTotal());
                    chequeSettlePanel.txtRemainingBalance.setText("" + sale.getGrandTotal());
                    chequeSettlePanel.txtNowPaying.setText("" + sale.getGrandTotal());
                } else {
                    float paidAmount = 0.0f;
                    for (Payment payment : payments) {
                        paidAmount += payment.getAmount();
                    }
                    chequeSettlePanel.txtTotalAmount.setText("" + sale.getGrandTotal());
                    chequeSettlePanel.txtPaidAmount.setText("" + paidAmount);
                    chequeSettlePanel.txtRemainingBalance.setText("" + (sale.getGrandTotal() - paidAmount));
                    chequeSettlePanel.txtNowPaying.setText("" + (sale.getGrandTotal() - paidAmount));
                }

                transaction.commit();
                session.close();
            } else if (name.equalsIgnoreCase("PTY1002")) { // Credit Settlements
                settlementDialog.panelWindow.removeAll();

                final CreditSettlePanel creditSettlePanel = new CreditSettlePanel(this.settlementDialog, "PTY1002");
                settlementDialog.panelFrame = creditSettlePanel;
                settlementDialog.panelWindow.add(settlementDialog.panelFrame);
                settlementDialog.panelWindow.revalidate();
                settlementDialog.panelWindow.repaint();
                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        creditSettlePanel.txtNowPaying.requestFocus();
                    }
                });

                Session session = HibernateUtil.getSessionFactory().openSession();
                Transaction transaction = session.beginTransaction();

                sale = (Sale) session.load(Sale.class, sale.getSaleCode());

                List<Payment> payments = session
                        .createCriteria(Payment.class)
                        .add(Restrictions.eq("invoice", this.invoice))
                        .list();

                Vehicle vehicle = (Vehicle) session.load(Vehicle.class, sale.getVehicle().getVehicleCode());

                BusinessPartner businessPartner = (BusinessPartner) session
                        .createCriteria(BusinessPartner.class)
                        .add(Restrictions.eq("businessPartnerCode", vehicle.getBusinessPartner().getBusinessPartnerCode()))
                        .uniqueResult();

                if (businessPartner != null) {
                    creditSettlePanel.cmbCustomer.setSelectedItem(businessPartner.getFirstName() + " " + businessPartner.getLastName());
                }

                if (payments.isEmpty()) {
                    creditSettlePanel.txtTotalAmount.setText("" + sale.getGrandTotal());
                    creditSettlePanel.txtRemainingBalance.setText("" + sale.getGrandTotal());
                    creditSettlePanel.txtNowPaying.setText("" + sale.getGrandTotal());
                } else {
                    float paidAmount = 0.0f;
                    for (Payment payment : payments) {
                        paidAmount += payment.getAmount();
                    }
                    creditSettlePanel.txtTotalAmount.setText("" + sale.getGrandTotal());
                    creditSettlePanel.txtPaidAmount.setText("" + paidAmount);
                    creditSettlePanel.txtRemainingBalance.setText("" + (sale.getGrandTotal() - paidAmount));
                    creditSettlePanel.txtNowPaying.setText("" + (sale.getGrandTotal() - paidAmount));
                }

                transaction.commit();
                session.close();
            } else if (name.equalsIgnoreCase("PTY1003")) { // Credit card Settlements
                settlementDialog.panelWindow.removeAll();

                final CreditCardSettlePanel creditCardSettlePanel = new CreditCardSettlePanel(this.settlementDialog, "PTY1003");
                settlementDialog.panelFrame = creditCardSettlePanel;
                settlementDialog.panelWindow.add(settlementDialog.panelFrame);
                settlementDialog.panelWindow.revalidate();
                settlementDialog.panelWindow.repaint();
                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        creditCardSettlePanel.txtNowPaying.requestFocus();
                    }
                });

                Session session = HibernateUtil.getSessionFactory().openSession();
                Transaction transaction = session.beginTransaction();

                sale = (Sale) session.load(Sale.class, sale.getSaleCode());

                List<Payment> payments = session
                        .createCriteria(Payment.class)
                        .add(Restrictions.eq("invoice", this.invoice))
                        .list();

                if (payments.isEmpty()) {
                    creditCardSettlePanel.txtTotalAmount.setText("" + sale.getGrandTotal());
                    creditCardSettlePanel.txtRemainingBalance.setText("" + sale.getGrandTotal());
                    creditCardSettlePanel.txtNowPaying.setText("" + sale.getGrandTotal());
                } else {
                    float paidAmount = 0.0f;
                    for (Payment payment : payments) {
                        paidAmount += payment.getAmount();
                    }
                    creditCardSettlePanel.txtTotalAmount.setText("" + sale.getGrandTotal());
                    creditCardSettlePanel.txtPaidAmount.setText("" + paidAmount);
                    creditCardSettlePanel.txtNowPaying.setText("" + (sale.getGrandTotal() - paidAmount));
                }

                transaction.commit();
                session.close();
            }
        }
    }
}
