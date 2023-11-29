<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>

<Center>
<h1 id="title"><u>ADU Hospital</u></h1>
 <h2 id="stitle">stay safe</h2>
 <hr>
 <ul id="menu">
			<li id="menu"><a href="Home.jsp">Home</a></li>
			<li id="menu"><a href="https://courseweb.sliit.lk/">login</a></li>
			<li id="menu"><a href="login1.jsp">Doctor-login</a></li>
			<li id="menu"><a href="https://courseweb.sliit.lk/">Contact us</a></li>
			<li id="menu"><a href="https://courseweb.sliit.lk/">About</a></li>
		</ul>
		<br><br>
</center>
<center>
<h1>Login</h1>
<form action="log" method="post">
<table>
	
	<tr><td><h3>E-mail</h3></td><td><input type="text" name="email" placeholder="Eg:wertgsyhu@gmail.com" class="me"></td></tr>
	
	<tr><td><h3>Password</h3></td><td><input type="password" name="psw" class="me"></td></tr>
</table>
<center><input type="submit" value="Login" class="bttn2"></center>


</form>
</Center>

</body>
</html>