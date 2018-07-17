<!--*********************************************************************************************************
 * @author medini
 *
 * 03-JUN-2018
 *
 *purpose:if loginSuccessful then click on logout to end transaction.
 **************************************************************************************************************-->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<center><h1>Successful login</h1></center>
<center>
<% String uname=(String)session.getAttribute("firstname");
out.println("Welcome"+uname);%>
</center>
<form action="Logout" method="post">
<div class="menu">
</div>
<center>
<h1>To log out<span style="color: #e6b800"></span></h1>
</center>
<center><h2>click logout</h2></center>
<center><input type="submit" value="logout"></center>
</form>
</body>
</html>