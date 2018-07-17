<!--*********************************************************************************************************
 * @author medini
 *
 * 03-JUN-2018
 *
 *purpose:To set the register page and take input from user
 **************************************************************************************************************-->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration  page</title>
<link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
<form action="RegisterController" method="post">
<div class="menu">
</div><br>
<center><h1>Registration <span style="color: black">page</span></h1></center>
<center><input id= "first" style="text-indent:30px;" type="text" name="firstname" placeholder="First name"><br></center>
<center><input id= "last" style="text-indent:30px;" type="text" name="lastname" placeholder="Last name"><br></center>
<center><input id= "email" style="text-indent:30px;" type="int" name="emailid" placeholder="Email"><br></center>
<center><input id= "password" style="text-indent:30px;" type="password" name="password" placeholder="Password"><br></center>
<center><input id= "confirmpassword" style="text-indent:30px;" type="password" name="password1" placeholder="confirm"><br></center>
<center><input id= "contact" style="text-indent:30px;" type="text" name="contact" placeholder="Contact number"><br></center><br>
<center><input id="in" type="submit" name="submit" value="Register"></input></center> 
</form>
</body>
</html>