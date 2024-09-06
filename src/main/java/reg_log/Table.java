package reg_log;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import static reg_log.Connect.*; 

public class Table {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
        
		Connection con=Connect.connect(); 
		Statement stmt=con.createStatement();  
		
		stmt.executeUpdate("CREATE TABLE REG (NAME VARCHAR(45),GENDER VARCHAR(45),BRANCH VARCHAR(45),EMAIL VARCHAR(45),PASSWORD VARCHAR(45))");
		
        System.out.println("table created");
		
       con.close();
	}

}
