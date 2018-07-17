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

/**********************************************************************************************
 * created by  medini
 * 
 * 03-JUN-2018
 *
 *PURPOSE:To check whether firstname and password are empty,If empty then filter will show an alert message.
 *********************************************************************************************/

public class Loginfilter implements Filter
{
    public Loginfilter() 
    {
       
    }
	
	public void destroy() 
	{
		
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException 
	{
		response.setContentType("text/html");
		String user=request.getParameter("firstname");
		String password=request.getParameter("pass");
		PrintWriter out=response.getWriter();
		if(user.equals(""))	
		{   
			out.println("<script type=\"text/javascript\">");  
			out.println("alert('Please Enter username');");  
			out.println("</script>");
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			rd.include(request, response);
		}
		
		else if(password.equals(""))
		{
			out.println("<script type=\"text/javascript\">");  
			out.println("alert('Please Enter password');");  
			out.println("</script>");
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
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