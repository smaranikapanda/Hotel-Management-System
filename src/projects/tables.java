/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projects;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author smara
 */
public class tables {
   public static void main(String args[])
   {
       Connection con=null;
       Statement st=null;
       try
       {
           con=ConnectionProvider.getCon();
           st=con.createStatement();
           st.executeUpdate("create table users (name varchar(200),email varchar(200),password varchar(50),securityQuestion varchar(500),answer varchar(200),address varchar(200),status varchar(20))");
           st.executeUpdate("create table room(roomNo varchar(10),roomType varchar(200),bed varchar(200),price int,status varchar(20))");
           st.executeUpdate("create table customer(id int,name varchar(200),mobileNumber varchar(20),nationality varchar(200),gender varchar(50),email varchar(200),idproof varchar(200),address varchar(500),checkin varchar(50),roomNo varchar(10),bed varchar(200),roomType varchar(200),pricePerDay int(10),numberOfDaysStay int(10),totalAmount varchar(200),checkout varchar(50))");      
           JOptionPane.showMessageDialog(null, "table created Successfully");
       }
       catch(Exception e)
       {
           JOptionPane.showMessageDialog(null, e);
       }
       finally
       {
         try
       {
           con.close();
           st.close();
       }
       catch(Exception e)
       {
           
       }  
       }
   }
}
