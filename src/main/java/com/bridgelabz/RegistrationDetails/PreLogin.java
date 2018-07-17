package com.bridgelabz.RegistrationDetails;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/****************************************************************************************************************
 * @author medini
 *
 * 03-Jun-2018
 * 
 *PURPOSE:PreLogin servlet to forward the request to successlogin.jsp
 ****************************************************************************************************************/
public class PreLogin  extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{ 
		RequestDispatcher rd= request.getRequestDispatcher("successlogin.jsp");
		rd.forward(request, response);	
	}
}