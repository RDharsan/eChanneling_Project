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
<center>
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
<center><h1>Doctor-Online Registration</h1></center>
<form action="reg" method="post">
	<div class="re">
	<table align="center">
		<tr><td>Name</td><td><input type="text" name="name" placeholder="Eg: R.Dharsan""></td></tr>
		<tr><td>E-mail</td><td><input type="text" name="email" placeholder="Eg:dharsh@gmail.com"></td></tr>
		<tr><td>Specialization</td><td><input type="text" name="spe" placeholder="Eg:Neurology"></td></tr>
		<tr><td>Contact Number</td><td><input type="text" name="phone" placeholder="Eg:0123456789"></td></tr>
		<tr><td>Date Of Birth</td><td><input type="text" name="dob" placeholder="Eg:1999/02/24"></td></tr>
		<tr><td>NIC number</td><td><input type="text" name="nic" placeholder="Eg:990685975V or 998547896254"></td></tr>
		<tr><td>Hospital Branch</td><td><select name="branch" id="br" class="se">
  				<option value="Colombo 1">Colombo 01</option>
 				<option value="Colombo 3">Colombo 02</option>
  				<option value="Colombo 06">Colombo 06</option>
  				<option value="Colombo 12">Colombo 12</option>
  				<option value="Colombo 13">Colombo 13</option>
  				<option value="Kalutara">Kalutara</option>
  				<option value="Gampaha">Gampaha</option>
  				<option value="Trincomalee">Trincomalee</option>
  				<option value="Jaffna">Jaffna</option>
  				<option value="Kandy">Kandy</option>  
	    </select></td></tr>
		<tr><td>Password</td><td><input type="text" name="pass"></td></tr>
		
	</table>
	</div>
	<center><input type="submit" value="Submit Details" class="bttn2"></center>
</form>


</body>
</html>