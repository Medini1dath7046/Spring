package com.bridgelabz.RegistrationDetails;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/****************************************************************************************************************
 * @author medini
 *
 * 03-Jun-2018
 * 
 *PURPOSE:LogoutFilter for register page to check whether the fields are empty or not .If empty the show a message. 
 ****************************************************************************************************************/
public class LogoutFilter implements Filter 
{

    public LogoutFilter() 
    {
       
    }

	public void destroy() 
	{
		
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException 
	{
		PrintWriter out=response.getWriter();
		String first_name=request.getParameter("firstname");
		String last_name=request.getParameter("lastname");
		String email=request.getParameter("emailid");
		String password=request.getParameter("password");
		String confirm_password=request.getParameter("password");
		String contact=request.getParameter("contact");
		
		if(first_name.equals("")||last_name.equals(""))
		{
			out.println("<script type=\"text/javascript\">");  
			out.println("alert('Please Enter all fields');");  
			out.println("</script>");
			RequestDispatcher rd = request.getRequestDispatcher("register.jsp");
			rd.include(request, response);
			
		}
		else if(email.equals("")||password.equals("")||confirm_password.equals(""))
		{
			out.println("<script type=\"text/javascript\">");  
			out.println("alert('Please Enter all fields');");  
			out.println("</script>");
			RequestDispatcher rd = request.getRequestDispatcher("register.jsp");
			rd.include(request, response);
		}

		else 
		{
			chain.doFilter(request, response);
		}	
	}

	public void init(FilterConfig fConfig) throws ServletException 
	{
		
	}
}