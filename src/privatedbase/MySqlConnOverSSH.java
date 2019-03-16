package privatedbase;


import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
 
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;
import java.sql.Connection;
 
public class MySqlConnOverSSH {
 
    /**
     * Java Program to connect to remote database through SSH using port forwarding
     */
    public static void main(String[] args) throws SQLException {
 
    	/* This section sets up the port forward
    	 * Take port 5656 on local machine and tunnel it to remote machine
    	 * and direct the output to localhost 3306, the mysql port on the
    	 * remote box
    	 */
    	
 //SSL Tunnerl settings
  String host="remotemachine.duh.com";  
//Remote host to connect to 
  String user="testuser";					
//Remote shell username
  String password="SecretPassword123";	
//Remote shell password
  int lport=5656; 
//Local port to create
  int rport=3306; 
 //Destination port
  String rhost="127.0.0.1";				//Destination address
 
//MySQL Connection settings
    }}