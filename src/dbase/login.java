package dbase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import org.json.simple.JSONObject;


public class login {

	public static void main(String[] args) {

                String userid="h34";
                String userpass="123";
              
		
		if(userid.equals("") || userpass.equals(""))
                {
                JOptionPane.showMessageDialog(null,"fields are empty");
                return;
                 }
                
                
Connection con = null;
String url = "jdbc:mysql://localhost:3306/";
String db = "securityprototype";
String driver = "com.mysql.jdbc.Driver";
String user = "root";
String pass = "";
try{
Class.forName(driver);
con = DriverManager.getConnection(url+db, user, pass);
Statement st = con.createStatement();
ResultSet rs=st.executeQuery("SELECT id FROM signuptbl WHERE id like '"+userid+"'");
if(rs.next()){
    JSONObject obj = new JSONObject();
      
      obj.put("ID", "userid");
      obj.put("NAME", "username");
      obj.put("EMAIL", "useremail");

      System.out.print(obj);
JOptionPane.showMessageDialog(null,obj);
}
else{
    String value1;
//int i= st.executeUpdate("Insert into register(id,firstName,lastName,address,email) values('"+value1+"','"+value2+"','"+value3+"','"+value4+"','"+value5+"')");
        
    JSONObject obj = new JSONObject();
      obj.put("ID", "invalid");
      obj.put("NAME", "invalid");
      obj.put("EMAIL", "invalid");
      System.out.print(obj);
JOptionPane.showMessageDialog(null,obj);
  
}
}
catch(Exception e){
System.out.println(e);
}
}
        }