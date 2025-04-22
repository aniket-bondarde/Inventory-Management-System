/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package commonfinish;

import dao.inventoryutils;
import java.io.File;
import javax.swing.JOptionPane;

/**
 *
 * @author THIS PC
 */
public class openpdf {
    public static void openbyid(String id){
        try{
            if((new File(inventoryutils.billpath+id+".pdf")).exists()){
                Process  p=Runtime
                        .getRuntime()
                        .exec("rundll32 url.dll,FileProtocolHandler "+ inventoryutils.billpath + "" +id+".pdf");
                        
            }
            else{
                JOptionPane.showMessageDialog(null, "File not exists");
            }
           
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
 
}
}
