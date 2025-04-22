/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author THIS PC
 */
public class tables {

    public static void main(String[] args) {
        Connection con = null;
        Statement st = null;
        try {
            con = cp.getCon();
            st = con.createStatement();
            //  st.executeUpdate("create table appuser(appuser_pk int AUTO_INCREMENT primary key,role varchar(50),name varchar(200),mobile varchar(50),email varchar(200),password varchar(50),address varchar(200),status varchar(50)");
            //st.executeUpdate("insert into appuser (role,name,mobile,email,password,address,status) values('superadmin','ash','8591254572','ash@gmail.com','admin','Flat no.1015,A wing Skyhigh projects,Lbs marg,Bhandup West ,Mumbai 400078','Active')");
            //st.executeUpdate("create table category(category_pk int AUTO_INCREMENT primary key, name varchar(200))");
            // st.executeUpdate("create table product(product_pk int AUTO_INCREMENT primary key, name varchar(200),quantity varchar(200),price int,description varchar(500),category_fk int)");
            //  st.executeUpdate("create table customer(customer_pk int AUTO_INCREMENT primary key, name varchar(200),mobile varchar(50),email varchar(200))");
            //st.executeUpdate("create table orderdetails(order_pk int AUTO_INCREMENT primary key, orderid varchar(200),customer_fk int,orderdate varchar(200),totalpaid int) ");
            JOptionPane.showMessageDialog(null, "Successfull");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                con.close();
                st.close();
            } catch (Exception e) {

            }

        }
    }

}
