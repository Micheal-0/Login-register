package reg_log;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Servlet implementation class Ser
 */
public class Ser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		String n=request.getParameter("uname");
		String p=request.getParameter("pass");
		
		try {
			PrintWriter pw=response.getWriter();
			
			
			Connection c=Connect.connect();
			Statement st=c.createStatement();
			
//			User u=new User();
//			u.setUsername("uname");
//			u.setPassword("pass");
			 
	            
			    PreparedStatement ps=c.prepareStatement("SELECT NAME FROM REG WHERE (EMAIL=? AND PASSWORD=?)");
                ps.setString(1,n);
			    ps.setString(2,p);
			    
			   
			    ResultSet rs=ps.executeQuery();
			    if(rs.next())
			    {			  
			    	pw.println("<center><h1>"+rs.getString("NAME")+"</h1></center>");
		             	pw.println("<center><h2>Logged in Successfully</h2><center>");
		            	pw.println("<center><a href=logout.jsp>logout</a><center>");
			    }
			    else
			    {
			    	response.sendRedirect("failed.jsp");
			    	
			    }	    
			    
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
