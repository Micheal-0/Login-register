package reg_log;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Servlet implementation class Ser1
 */
public class Ser1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ser1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		PrintWriter pw=response.getWriter();
		
		String n=request.getParameter("name");
		String g=request.getParameter("gender");
		String b=request.getParameter("branch");
		String m=request.getParameter("mail");
		String p=request.getParameter("password");
		
		try {
			    Connection c=Connect.connect();
			    Statement s=c.createStatement();
			    
			   s.executeUpdate("INSERT INTO REG (NAME,GENDER,BRANCH,EMAIL,PASSWORD) VALUES('"+n+"','"+g+"','"+b+"','"+m+"','"+p+"')");
			   
			   pw.println("<center><h2>Registration Successfull</h2><center>");
			   pw.print("<center><a href=login.jsp>login</a><center>");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
