package com.bridgelabz.RegistrationDetails;

import java.io.Serializable;

/*****************************************************************************************************************
 * @author Ankita Kalgutkar
 *
 *  03-Jun-2018
 *
 *PURPOSE:Getter and setter methods to take values from user.
 ******************************************************************************************************************/
public class UserDetails implements Serializable
{
	private static final long serialVersionUID = 1L;
	private int id;
	private String firstname;
	private String lastname;
	private String emailid;
	private String password;
	private String contact;
	
	public void setfirstname(String firstname)
	{
		this.firstname=firstname;
	}
	public String getfirstname()
	{
		return firstname;
	}
	
	public void setlastname(String lastname)
	{
		this.lastname=lastname;
	}
	public String getlastname()
	{
		return lastname;
	}
	
	public void setemailid(String emailid)
	{
		this.emailid=emailid;
	}
	
	public String getemailid()
	{
		return emailid;
	}
	
	public void setpassword(String password)
	{
		this.password=password;
	}
	public String getpassword()
	{
		return password;
	}
	
	public void setcontact(String contact)
	{
		this.contact=contact;
	}
	public String getcontact() 

		
	{
		return contact;
	}

	@Override
	public String toString() 
	{
		return "UserDetails [firstname=" + firstname + ", lastname=" + lastname + ", emailid=" + emailid + ", password="
				+ password + ", contact=" + contact + "]";
	}
}