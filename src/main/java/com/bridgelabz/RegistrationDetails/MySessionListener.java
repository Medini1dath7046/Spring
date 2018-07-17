package com.bridgelabz.RegistrationDetails;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
/****************************************************************************************************************
 * @author medini
 *
 * 03-Jun-2018
 * 
 *PURPOSE:Listener to check when the initialization and destruction of events occur .
 ****************************************************************************************************************/
public class MySessionListener implements ServletContextListener
{
	public void contextDestroyed(ServletContextEvent event) 
	{ 
	
		System.out.println("Context Destroyed");		
	}

	public void contextInitialized(ServletContextEvent event) 
	{	
		System.out.println("Context Initialized");
	}	  
}  


 
