

import java.sql.*;
import java.util.Random;
import java.io.IOException;
import java.io.PrintWriter;

//import javax.servlet.*;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class Reg
 */

@WebServlet("/servlet/Reg")

public class Reg extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Reg() 
    {
        // TODO Auto-generated constructor stub
    	super();
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
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		// TODO Auto-generated method stub
		doGet(request, response);
		
		String name = request.getParameter("name");
		String id = request.getParameter("username");
	
		//String email = request.getParameter("email");
		String password = request.getParameter("password");
	//	String pass2 = request.getParameter("pass2");
		
		System.out.println("Done!");		
		
				try {
					
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
					PreparedStatement stmt = con.prepareStatement("insert into reg values(?,?,?)");
					
					stmt.setString(1,name);
		
					stmt.setString(2,id);
					
					
					stmt.setString(3,password);
				//	stmt.setString(9,email);
					//String query = 
					
				}
				
				catch (ClassNotFoundException e) 
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
					System.out.println("Err"+e);			
					} catch (SQLException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
					System.out.println("Err"+e);		
					
				}
			
		
	}

}
