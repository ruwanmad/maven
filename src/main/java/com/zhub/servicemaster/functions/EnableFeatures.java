/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zhub.servicemaster.functions;

import com.zhub.servicemaster.forms.MainFrame;
import com.zhub.servicemaster.models.UserPrivilage;

/**
 *
 * @author Ruwan Madawala
 */
public class EnableFeatures {

    public void enableFeature(UserPrivilage userPrivilage, MainFrame mainFrame) {
        String privilageCode = userPrivilage.getPrivilageCode();
        String[] codes = privilageCode.split(",");
        for (String code : codes) {
            switch (code) {
                case "1": {
                    mainFrame.mFile.setEnabled(true);
                    break;
                }
                case "2": {
                    mainFrame.mTransactions.setEnabled(true);
                    break;
                }
                case "3": {
                    mainFrame.mOptions.setEnabled(true);
                    break;
                }
                case "4": {
                    mainFrame.mReports.setEnabled(true);
                    break;
                }
                case "5": {
                    break;
                }
                case "11": {
                    mainFrame.mMasterFiles.setEnabled(true);
                    break;
                }
                case "12": {
                    mainFrame.miUsers.setEnabled(true);
                    break;
                }
                case "13": {
                    mainFrame.miUserPrivilages.setEnabled(true);
                    break;
                }
                case "14": {
                    break;
                }
                case "15": {
                    break;
                }
                case "16": {
                    break;
                }
                case "17": {
                    break;
                }
                case "18": {
                    break;
                }
                case "19": {
                    break;
                }
                case "21": {
                    mainFrame.miService.setEnabled(true);
                    break;
                }
                case "22": {
                    mainFrame.miSale.setEnabled(true);
                    break;
                }
                case "23": {
                    mainFrame.miSalesReturns.setEnabled(true);
                    break;
                }
                case "24": {
                    mainFrame.miGRN.setEnabled(true);
                    break;
                }
                case "25": {
                    mainFrame.miChequeReceipts.setEnabled(true);
                    break;
                }
                case "26": {
                    mainFrame.miBillSetoff.setEnabled(true);
                    break;
                }
                case "27": {
                    mainFrame.miPayments.setEnabled(true);
                    break;
                }
                case "28": {
                    break;
                }
                case "29": {
                    break;
                }
                case "31": {
                    mainFrame.miSalesHistory.setEnabled(true);
                    break;
                }
                case "32": {
                    mainFrame.miAddShortcuts.setEnabled(true);
                    break;
                }
                case "33": {
                    break;
                }
                case "34": {
                    break;
                }
                case "35": {
                    break;
                }
                case "36": {
                    break;
                }
                case "37": {
                    break;
                }
                case "38": {
                    break;
                }
                case "39": {
                    break;
                }
                case "41": {
                    mainFrame.miSalesReports.setEnabled(true);
                    break;
                }
                case "42": {
                    mainFrame.miStockReports.setEnabled(true);
                    break;
                }
                case "43": {
                    break;
                }
                case "44": {
                    break;
                }
                case "45": {
                    break;
                }
                case "46": {
                    break;
                }
                case "47": {
                    break;
                }
                case "48": {
                    break;
                }
                case "49": {
                    break;
                }
                case "51": {
                    break;
                }
                case "52": {
                    break;
                }
                case "53": {
                    break;
                }
                case "54": {
                    break;
                }
                case "55": {
                    break;
                }
                case "56": {
                    break;
                }
                case "57": {
                    break;
                }
                case "58": {
                    break;
                }
                case "59": {
                    break;
                }
                case "111": {
                    mainFrame.mAccounts.setEnabled(true);
                    break;
                }
                case "112": {
                    mainFrame.mStorage.setEnabled(true);
                    break;
                }
                case "113": {
                    mainFrame.miLocations.setEnabled(true);
                    break;
                }
                case "114": {
                    mainFrame.miPrinters.setEnabled(true);
                    break;
                }
                case "115": {
                    mainFrame.miCategory.setEnabled(true);
                    break;
                }
                case "116": {
                    mainFrame.miItemType.setEnabled(true);
                    break;
                }
                case "117": {
                    mainFrame.miSubCategory.setEnabled(true);
                    break;
                }
                case "118": {
                    mainFrame.miItems.setEnabled(true);
                    break;
                }
                case "119": {
                    mainFrame.miBom.setEnabled(true);
                    break;
                }
                case "1110": {
                    mainFrame.miBusinessPartner.setEnabled(true);
                    break;
                }
                case "1111": {
                    mainFrame.miBusinessPartner.setEnabled(true);
                    break;
                }
                case "1112": {
                    mainFrame.miVehileType.setEnabled(true);
                    break;
                }
                case "1113": {
                    mainFrame.miVehicles.setEnabled(true);
                    break;
                }
                case "1114": {
                    break;
                }
                case "1115": {
                    break;
                }
                case "1116": {
                    break;
                }
                case "1117": {
                    break;
                }
            }
        }
    }
}
