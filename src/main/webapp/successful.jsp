<!--*********************************************************************************************************
 * @author medini
 *
 * 03-JUN-2018
 *
 *purpose:Successful registration then click login to continue.
 **************************************************************************************************************-->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Successful_Page</title>
<link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
<form action="WelcomeServlet" method="post">
<div class="menu">
</div>
<center><h1>successfully registerd<span style="color: black"></span></h1></center>
<center>If you want to login, </center>
<center><input type="submit" value=" click login"></center>
</form>
</body>
</html>