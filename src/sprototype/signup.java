package sprototype;

//STEP 1. Import required packages
import java.sql.*;

public class signup {
   // JDBC driver name and database URL
   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
   static final String DB_URL = "jdbc:mysql://localhost/securityapp";

   //  Database credentials
   static final String USER = "root";
   static final String PASS = "";
   
   public static void main(String[] args) {
   Connection conn = null;
   Statement stmt = null;
   PreparedStatement ps = null;
   try{ 
      //STEP 2: Register JDBC driver
      Class.forName("com.mysql.jdbc.Driver");

      //STEP 3: Open a connection
      System.out.println("Connecting to a selected database...");
      conn = DriverManager.getConnection(DB_URL, USER, PASS);
      System.out.println("Connected database successfully...");
      
      //STEP 4: Execute a query
      System.out.println("Inserting records into the table...");
      stmt = conn.createStatement();

      String aa = "one";
      String bb = "two";
      String cc = "three";
      String dd = "four";
      
      
      ps = conn.prepareStatement("INSERT INTO signup-tbl " + " (name, email, pword, phone) " + " VALUES(?,?,?,?)");		
			
				ps.setString(1,aa);
				ps.setString(2,bb);
                                ps.setString(3,cc);
				ps.setString(4,dd);
				
      
    //  String sql = "INSERT INTO users " + "VALUES (ab, 'cc')";
      ps.executeUpdate();
      
       
      
    System.out.println("Inserted records into the table...");

   }catch(SQLException se){
      //Handle errors for JDBC
      se.printStackTrace();
   }catch(Exception e){
      //Handle errors for Class.forName
      e.printStackTrace();
   }finally{
      //finally block used to close resources
      try{
         if(stmt!=null)
            conn.close();
      }catch(SQLException se){
      }// do nothing
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se){
         se.printStackTrace();
      }//end finally try
   }//end try
   System.out.println("Goodbye!");
}//end main
}//end JDBCExample