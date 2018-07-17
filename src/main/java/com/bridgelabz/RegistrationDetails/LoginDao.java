package com.bridgelabz.RegistrationDetails;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/***********************************************************************************************
 * @author  medini
 *
 * 03-Jun-2018
 *
 *PURPOSE:Method to validate username and password for login.
 ************************************************************************************************/
public class LoginDao 
{
	public static boolean validate(String user_id, String pass_word)
	{ 
		boolean status =false;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student?useSSL=false","root","root");
			String logq="select * from  Registry where FirstName= ? and Password= ?";	
			PreparedStatement ps=con.prepareStatement(logq);
			ps.setString(1, user_id);
			ps.setString(2, pass_word);
			ResultSet rs = ps.executeQuery();
			status=rs.next();	
		}
		catch(Exception e)
		{
			System.out.println(e);
		}		
		return status;		
	}
	
	public static String password(String Email)
	{ 
		String pass ="";
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student?useSSL=false","root","root");
			String logq="select Password from  Registry where Email='"+Email+"'";	
			PreparedStatement ps=con.prepareStatement(logq);
			ResultSet rs = ps.executeQuery();
			while(rs.next())	
			{
				 pass= rs.getString("Password");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return pass;
		
			
	}

	
}
