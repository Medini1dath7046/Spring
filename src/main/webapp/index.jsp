<!--*****************************************************************************************************
 * @author medini
 *
 * 03-JUN-2018
 *
 *purpose:To set the login page and take input from user
 **************************************************************************************************************-->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Index_Page</title>
<link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
<form action="LoginServlet" method="post">
	<div class="menu">
	</div><br><br>
    <center><h1>Login<span style="color: black">Page</span></h1></center>
    <center><input type="text" name="firstname" placeholder="Username"></input><br><br></center>
    <center><input type="password" name=pass placeholder="Password"></input><br></center><br>
  	<center><input id="in" type= "submit" name="submit" value="Login"></input><br><br></center>
<center>
</center>  
</form>
<form action="Register" method="post">
    <div class="round">
    <center> If you are not a registered your, then<strong> <input type="submit" value="create an account"></strong></center>
    </div>
    <center><i font style="color: #e6b800 "> <br></i></center>
</form>

<form action="ForgotPasswordServlet" method="post">
    <div class="round">
    <center> if you forgotton your password? then <strong> <input type="submit" value="ForgotPassword"></strong></center>
    </div>
    <center><i font style="color: #e6b800 "> <br></i></center>
</form>

</body>
</html>