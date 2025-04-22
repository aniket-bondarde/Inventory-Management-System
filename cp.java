/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.Connection;
import java.sql.DriverManager;


/**
 *
 * @author THIS PC
 */
public class cp {
    public static Connection getCon(){
        try{
             Class.forName("com.mysql.cj.jdbc.Driver");
             Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/inventorysystem?useSSL=false","root","juirohit45");
             return con;
             
        }
        catch(Exception e){
            System.out.println(e);
            return null;
        }
        
    }
    
}
