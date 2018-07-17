package com.bridgelabz.RegistrationDetails;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/****************************************************************************************************************
 * created by  medini
 * 03-JUN-2018
 *
 *Purpose:If username and password are validated to true then display the successful page else show alert message.
 *
 ***************************************************************************************************************/
public class LoginServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{  		
		PrintWriter out = response.getWriter();
		String user = request.getParameter("firstname");
		String passw = request.getParameter("pass");
		UserDetails details=new UserDetails();
		details.setfirstname(user);
		details.setpassword(passw);
		String username=details.getfirstname();
		String pin=details.getpassword();
		if(LoginDao.validate(username,pin))
		{
			HttpSession session = request.getSession();
			session.setAttribute("firstname", user);
			RequestDispatcher rd= request.getRequestDispatcher("PreLogin");
			rd.forward(request, response);
		}
		
		else 
		{
			out.println("<script type=\"text/javascript\">");  
			out.println("alert('Sorry, Password and Username Error...you are not registered user');");  
			out.println("</script>");
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			rd.include(request, response);
		}
		out.close();
	}
}