/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fola
 */

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class dbaseConnx 
{
    final static String url = "jdbc:mysql://127.0.0.1:3306/crimeDetection";
    final static String driver = "com.mysql.jdbc.Driver";
    final static String username = "root";
    final static String password = "Somya@123";
 
    public static Connection openConnection()
    {  
        try
        {
            Class.forName(driver);
           Connection conn = (Connection) DriverManager.getConnection(url,username,password);
           return conn;
        }
        catch (ClassNotFoundException | SQLException e)
        {
           JOptionPane.showMessageDialog(null, e);
           return null;
        }
    }
}
