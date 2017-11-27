/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zhub.servicemaster.functions;

import com.zhub.servicemaster.models.Item;
import com.zhub.servicemaster.models.SellingPrice;
import com.zhub.servicemaster.utils.HibernateUtil;
import java.util.Date;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author RuwanM
 */
public class ItemFunctions {

    public static float getItemSellingPrice(Item item) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        List<SellingPrice> todaySellingPrices = session
                .createCriteria(SellingPrice.class)
                .add(Restrictions.eq("item", item))
                .add(Restrictions.eq("effectiveDate", new Date()))
                .addOrder(Order.desc("createdTime"))
                .list();

        if (todaySellingPrices.isEmpty()) {
            List<SellingPrice> sellingPrices = session
                    .createCriteria(SellingPrice.class)
                    .add(Restrictions.eq("item", item))
                    .add(Restrictions.le("effectiveDate", new Date()))
                    .addOrder(Order.desc("effectiveDate"))
                    .addOrder(Order.desc("createdTime"))
                    .list();
            if (sellingPrices.isEmpty()) {
                session.close();
                return 0.0f;
            } else {
                for (SellingPrice sellingPrice : sellingPrices) {
                    session.close();
                    return sellingPrice.getSellingPrice();
                }
            }
        } else {
            for (SellingPrice todaySellingPrice : todaySellingPrices) {
                session.close();
                return todaySellingPrice.getSellingPrice();
            }
        }
        return 0.0f;
    }
}
