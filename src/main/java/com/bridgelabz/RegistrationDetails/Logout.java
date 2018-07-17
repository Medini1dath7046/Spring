package com.bridgelabz.RegistrationDetails;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/****************************************************************************************************************
 * @author Medini
 *
 * 03-Jun-2018
 * 
 *PURPOSE:Logout Servlet to forward to logout.jsp to avoid to print logout.jsp in the browser.
 ****************************************************************************************************************/
public class Logout extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{ 
		RequestDispatcher rd= request.getRequestDispatcher("logout.jsp");
		rd.forward(request, response);
	}
}