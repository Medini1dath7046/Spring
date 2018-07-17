<!--*********************************************************************************************************
 * @author  medini
 *
 * 03-JUN-2018
 *
 *purpose:if Registration successful display the login page
 **************************************************************************************************************-->
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<center><h1>Welcome to login Page!!!!!!</h1></center>
<form action="LoginServlet" method="post">
<div class="menu">
</div><br><br>
<center><h1>Login <span style="color: black">Page</span></h1></center>
<center><input type="text" name="firstname" placeholder="Username"></input><br><br></center>
<center><input type="password" name=pass placeholder="Password"></input><br></center><br>
<center><input id="in" type= "submit" name="submit" value="LOGIN"></input><br><br></center>
<div class="round">
</div>
<center><i font style="color: #e6b800 "> <br> </i></center>
</form>
<form action="Register" method="post">
<div class="menu">
<center>if you want to register<input id="in" type= "submit" name="submit" value="Register"></input><br><br></center>
</div>
<center><i font style="color: #e6b800 "> <br> </i></center>
</form>
</body>
</html>