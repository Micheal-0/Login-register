package reg_log;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import static reg_log.Provider.*;

public class Connect {
	
	
	public static Connection connect() throws SQLException
	{
		Connection con=DriverManager.getConnection(CONNECTION_URL,USERNAME,PASSWORD);
		Statement st=con.createStatement();
		
		return con;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
	}

}
