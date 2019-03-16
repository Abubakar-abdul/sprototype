/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sprototype;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author SIDDEEQ
 */
public class Sprototype {
    
     Connection conn = null;
    ResultSet rs;
    PreparedStatement pst;
   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         try {
             conn = DriverManager.getConnection("jdbc:Mysql://localhost/pis_p","root","");
            
         String sql = "INSERT INTO `Account`(`IDNo`, `Username`, `Password`, `Email`) VALUES (?,?,?,?)";
         pst = conn.prepareStatement(sql);
         pst.setString(1,"1");
         pst.setString(2,"2");
         pst.setString(3,"3");
         pst.setString(4,"4");
         pst.execute();
          JOptionPane.showMessageDialog(null,"YOUR DATA HAS BEN SAVE SUCCEFULLY"); 
         } catch (Exception e) 
         {
             JOptionPane.showMessageDialog(null,e);
         }
    }                                        

        // TODO code application logic here
    }
    
}
