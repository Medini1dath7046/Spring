package com.bridgelabz.RegistrationDetails;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/*****************************************************************************************************************
 * @author Ankita Kalgutkar
 *
 *  03-Jun-2018
 *
 *PURPOSE:Servlet to insert values in database for registration of an account.
 ******************************************************************************************************************/
public class RegisterController extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
    public RegisterController() 
    {
        super();
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");	
		String fname = request.getParameter("firstname");
		String lname = request.getParameter("lastname");
		String eid = request.getParameter("emailid");
		String pword = request.getParameter("password");
		String confirm_pass=request.getParameter("password1");
		String cont= request.getParameter("contact");
					                       	
		try
		{
			PrintWriter out = response.getWriter();	
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student?useSSL=false","root","root");
				
			if(pword.equals(confirm_pass))	
			{
					
				String str="Insert into Registry values(NULL,?,?,?,?,?)";
				PreparedStatement ps=con.prepareStatement(str);	
				ps.setString(1, fname);
				ps.setString(2, lname);
				ps.setString(3, eid);
				ps.setString(4, pword);
				ps.setString(5, cont);
				ps.executeUpdate();
				out.println("<script type=\"text/javascript\">");  
				out.println("alert('Sign Up Successful');");  
				out.println("</script>");	
				RequestDispatcher rd = request.getRequestDispatcher("successful.jsp");
				rd.forward(request, response);
			}	
			
			else
			{	
				out.println("<script type=\"text/javascript\">");  
				out.println("alert('Password dooesn't match');");  
				out.println("</script>");
				HttpSession session = request.getSession();
				session.invalidate();
				RequestDispatcher rd = request.getRequestDispatcher("unsuccessful.jsp");
				rd.forward(request, response);
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}