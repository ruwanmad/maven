/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zhub.servicemaster.accounts;

import com.zhub.servicemaster.data.SystemData;
import com.zhub.servicemaster.forms.MainFrame;
import com.zhub.servicemaster.models.Account;
import com.zhub.servicemaster.models.AccountPosting;
import com.zhub.servicemaster.models.BusinessPartner;
import com.zhub.servicemaster.models.Grn;
import com.zhub.servicemaster.models.Invoice;
import com.zhub.servicemaster.models.Sale;
import com.zhub.servicemaster.utils.HibernateUtil;
import java.util.Date;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author RuwanM
 */
public class PostAccounts {

    public void cashDebitPosting(Account debitAccount,
            Invoice invoice,
            String narration,
            float amount) {
        if (debitAccount != null) {
            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();

            Date date = new Date();

            AccountPosting posting = new AccountPosting();
            posting.setAccount(debitAccount);
            posting.setDebit(amount);
            posting.setInvoice(invoice);
            posting.setCreatedDate(date);
            posting.setCreatedTime(date);
            posting.setCreatedUser(MainFrame.user.getUserId());
            posting.setNarration(narration);
            posting.setPostedDate(date);

            session.saveOrUpdate(posting);

            transaction.commit();
            session.close();
        }
    }

    public void chequeDebitPosting(Account debitAccount,
            BusinessPartner businessPartner,
            Invoice invoice,
            float amount,
            Date chequeDate,
            int creditDays,
            String chequeNumber,
            String narration) {
        if (debitAccount != null) {
            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();

            Date date = new Date();

            Sale sale;
            if (invoice != null) {
                sale = (Sale) session.load(Sale.class, invoice.getSale().getSaleCode());
            } else {
                sale = null;
            }

            AccountPosting posting = new AccountPosting();
            posting.setAccount(debitAccount);
            if (sale != null) {
                posting.setDebit(sale.getGrandTotal());
            } else {
                posting.setDebit(amount);
            }
            posting.setBusinessPartner(businessPartner);
            posting.setChequeDate(chequeDate);
            posting.setNumberOfDays(creditDays);
            posting.setChequeNumber(chequeNumber);
            posting.setInvoice(invoice);
            posting.setCreatedDate(date);
            posting.setCreatedTime(date);
            posting.setCreatedUser(MainFrame.user.getUserId());
            posting.setNarration(narration);
            posting.setPostedDate(date);

            session.saveOrUpdate(posting);

            transaction.commit();
            session.close();
        }
    }

    public void creditDebitPosting(Account debitAccount,
            BusinessPartner businessPartner,
            Invoice invoice,
            int cretidDays,
            String narration) {
        if (debitAccount != null) {
            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();

            Date date = new Date();

            Sale sale = (Sale) session.load(Sale.class, invoice.getSale().getSaleCode());

            AccountPosting posting = new AccountPosting();
            posting.setAccount(debitAccount);
            posting.setDebit(sale.getGrandTotal());
            posting.setBusinessPartner(businessPartner);
            posting.setNumberOfDays(cretidDays);
            posting.setInvoice(invoice);
            posting.setCreatedDate(date);
            posting.setCreatedTime(date);
            posting.setCreatedUser(MainFrame.user.getUserId());
            posting.setNarration(narration);
            posting.setPostedDate(date);

            session.saveOrUpdate(posting);

            transaction.commit();
            session.close();
        }
    }

    public void creditCardDebitPosting(Account debitAccount,
            Invoice invoice,
            String cardNumber,
            Date expireDate,
            String bank,
            String cardType,
            String narration) {
        if (debitAccount != null) {
            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();

            Date date = new Date();

            Sale sale = (Sale) session.load(Sale.class, invoice.getSale().getSaleCode());

            AccountPosting posting = new AccountPosting();
            posting.setAccount(debitAccount);
            posting.setDebit(sale.getGrandTotal());
            posting.setRemark(bank + ";" + cardType + ";" + cardNumber + ";" + SystemData.DATE_FORMAT.format(expireDate));
            posting.setInvoice(invoice);
            posting.setCreatedDate(date);
            posting.setCreatedTime(date);
            posting.setCreatedUser(MainFrame.user.getUserId());
            posting.setNarration(narration);
            posting.setPostedDate(date);

            session.saveOrUpdate(posting);

            transaction.commit();
            session.close();
        }
    }

    public void generalDebitPosting(Account creditAccount,
            BusinessPartner businessPartner,
            float amount,
            String narration) {
        if (creditAccount != null) {
            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();

            Date date = new Date();

            AccountPosting posting = new AccountPosting();
            posting.setAccount(creditAccount);
            posting.setDebit(amount);
            posting.setBusinessPartner(businessPartner);
            posting.setCreatedDate(date);
            posting.setCreatedTime(date);
            posting.setCreatedUser(MainFrame.user.getUserId());
            posting.setNarration(narration);
            posting.setPostedDate(date);

            session.saveOrUpdate(posting);

            transaction.commit();
            session.close();
        }
    }

    public void cashCreditPosting(Account creditAccount,
            Invoice invoice,
            String narration,
            float amount) {
        if (creditAccount != null) {
            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();

            Date date = new Date();

            AccountPosting posting = new AccountPosting();
            posting.setAccount(creditAccount);
            posting.setCredit(amount);
            posting.setInvoice(invoice);
            posting.setCreatedDate(date);
            posting.setCreatedTime(date);
            posting.setCreatedUser(MainFrame.user.getUserId());
            posting.setNarration(narration);
            posting.setPostedDate(date);

            session.saveOrUpdate(posting);

            transaction.commit();
            session.close();
        }
    }

    public void chequeCreditPosting(Account creditAccount,
            BusinessPartner businessPartner,
            Invoice invoice,
            float amount,
            Date chequeDate,
            int creditDays,
            String chequeNumber,
            String narration) {
        if (creditAccount != null) {
            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();

            Date date = new Date();

            Sale sale;
            if (invoice != null) {
                sale = (Sale) session.load(Sale.class, invoice.getSale().getSaleCode());
            } else {
                sale = null;
            }

            AccountPosting posting = new AccountPosting();
            posting.setAccount(creditAccount);
            if (sale != null) {
                posting.setCredit(sale.getGrandTotal());
            } else {
                posting.setCredit(amount);
            }
            posting.setBusinessPartner(businessPartner);
            posting.setChequeDate(chequeDate);
            posting.setNumberOfDays(creditDays);
            posting.setChequeNumber(chequeNumber);
            posting.setInvoice(invoice);
            posting.setCreatedDate(date);
            posting.setCreatedTime(date);
            posting.setCreatedUser(MainFrame.user.getUserId());
            posting.setNarration(narration);
            posting.setPostedDate(date);

            session.saveOrUpdate(posting);

            transaction.commit();
            session.close();
        }
    }

    public void creditCreditPosting(Account creditAccount,
            BusinessPartner businessPartner,
            Invoice invoice,
            int cretidDays,
            String narration) {
        if (creditAccount != null) {
            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();

            Date date = new Date();

            Sale sale = (Sale) session.load(Sale.class, invoice.getSale().getSaleCode());

            AccountPosting posting = new AccountPosting();
            posting.setAccount(creditAccount);
            posting.setCredit(sale.getGrandTotal());
            posting.setBusinessPartner(businessPartner);
            posting.setNumberOfDays(cretidDays);
            posting.setInvoice(invoice);
            posting.setCreatedDate(date);
            posting.setCreatedTime(date);
            posting.setCreatedUser(MainFrame.user.getUserId());
            posting.setNarration(narration);
            posting.setPostedDate(date);

            session.saveOrUpdate(posting);

            transaction.commit();
            session.close();
        }
    }

    public void creditCardCreditPosting(Account creditAccount,
            Invoice invoice,
            String cardNumber,
            Date expireDate,
            String bank,
            String cardType,
            String narration) {
        if (creditAccount != null) {
            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();

            Date date = new Date();

            Sale sale = (Sale) session.load(Sale.class, invoice.getSale().getSaleCode());

            AccountPosting posting = new AccountPosting();
            posting.setAccount(creditAccount);
            posting.setCredit(sale.getGrandTotal());
            posting.setRemark(bank + ";" + cardType + ";" + cardNumber + ";" + SystemData.DATE_FORMAT.format(expireDate));
            posting.setInvoice(invoice);
            posting.setCreatedDate(date);
            posting.setCreatedTime(date);
            posting.setCreatedUser(MainFrame.user.getUserId());
            posting.setNarration(narration);
            posting.setPostedDate(date);

            session.saveOrUpdate(posting);

            transaction.commit();
            session.close();
        }
    }

    public void generalCreditPosting(Account creditAccount,
            BusinessPartner businessPartner,
            float amount,
            String narration) {
        if (creditAccount != null) {
            Session session = HibernateUtil.getSessionFactory().openSession();
            Transaction transaction = session.beginTransaction();

            Date date = new Date();

            AccountPosting posting = new AccountPosting();
            posting.setAccount(creditAccount);
            posting.setCredit(amount);
            posting.setBusinessPartner(businessPartner);
            posting.setCreatedDate(date);
            posting.setCreatedTime(date);
            posting.setCreatedUser(MainFrame.user.getUserId());
            posting.setNarration(narration);
            posting.setPostedDate(date);

            session.saveOrUpdate(posting);

            transaction.commit();
            session.close();
        }
    }

    public void purchaseDebitPosting(Account debitAccount, Grn grn, String narration) {

    }

    public void purchaseCreditPosting(Account creditAccount, Grn grn, String narration) {

    }
}
