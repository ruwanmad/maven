/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zhub.servicemaster.functions;

import com.zhub.servicemaster.configs.Configs;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporter;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.export.JRPrintServiceExporter;
import net.sf.jasperreports.engine.export.JRPrintServiceExporterParameter;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author RuwanM
 */
public class PrintFunctions {

    public void printInvoice(String saleCode, boolean cash) {
        JdbcConnection jbConnection = new JdbcConnection();
        Connection connection = jbConnection.getConnection();

        if (connection != null) {
            String reportFile;
            if (cash) {
                reportFile = "reports/cash invoice.jasper";
            } else {
                reportFile = "reports/invoice.jasper";
            }

            Map map = new HashMap();
            map.put("serviceCode", saleCode);

            try {
                JasperPrint jasperPrint = JasperFillManager.fillReport(reportFile, map, connection);

                if (Configs.viewBill == 1) {
                    JasperViewer.viewReport(jasperPrint, false);
                }

                if (Configs.printBill == 1) {
                    PrintService printService = PrintServiceLookup.lookupDefaultPrintService();
                    JRExporter exporter = new JRPrintServiceExporter();
                    exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
                    exporter.setParameter(JRPrintServiceExporterParameter.PRINT_SERVICE_ATTRIBUTE_SET, printService.getAttributes());
                    exporter.setParameter(JRPrintServiceExporterParameter.DISPLAY_PAGE_DIALOG, false);
                    exporter.setParameter(JRPrintServiceExporterParameter.DISPLAY_PRINT_DIALOG, false);
                    exporter.exportReport();
                }
            } catch (JRException ex) {
                Logger.getLogger(PrintFunctions.class.getName()).log(Level.SEVERE, null, ex);
            }
            jbConnection.closeConnection();
        }
    }
}
