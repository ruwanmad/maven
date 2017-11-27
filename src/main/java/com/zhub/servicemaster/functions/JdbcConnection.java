/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.zhub.servicemaster.functions;

import com.zhub.servicemaster.configs.Configs;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author RuwanM
 */
public class JdbcConnection {
    
    private Connection connection;
    
    public Connection getConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+Configs.database+"?"
                    + "zeroDateTimeBehavior=convertToNull",
                    Configs.username,
                    Configs.password);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(JdbcConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return this.connection;
    }
    
    public void closeConnection(){
        try {
            if (this.connection != null && !this.connection.isClosed()) {
                this.connection.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(JdbcConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}