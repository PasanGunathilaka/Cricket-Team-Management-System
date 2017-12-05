/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package kck;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Pasan
 */
public class dbc {
      
     private Connection conn;
 private Statement stmt;
 private ResultSet rs;
    
    public dbc()
  {
 try{
     
     
     Class.forName("com.mysql.jdbc.Driver");
    
     conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/cricket?zeroDateTimeBehavior=convertToNull","root","");
     stmt=conn.createStatement();
     System.out.println("Connected Db");
   
     
 }catch(ClassNotFoundException | SQLException e){
     
 System.out.println("Not Connected Db");
 }
 }
    

 private com.mysql.jdbc.Connection DBConnection;
    
    public com.mysql.jdbc.Connection connect() throws ClassNotFoundException {
    try{
        
        Class.forName("com.mysql.jdbc.Driver");
        
        
        DBConnection = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/cricket","root","");
          
           
        
    }
    
       catch(SQLException e){
           System.out.println("No Database"+e);
           
       }
       return  DBConnection;
    }
}