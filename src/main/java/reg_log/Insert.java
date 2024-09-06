package reg_log;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import static reg_log.Connect.*;

public class Insert {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		Connection con=Connect.connect(); 
		Statement stmt=con.createStatement(); 
		
//		stmt.executeUpdate("INSERT INTO LOG(NAME,USERNAME,PASSWORD) VALUES('Yes','abc','123')");
		
		stmt.executeUpdate("DELETE FROM REG WHERE GENDER='MALE'");
		
        System.out.println("DETAILS INSERTED");
        con.close();
	}

}
