<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="style.css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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
	<h1>Enter Prescription</h1>
	<form action="add" method="post">
	<table>
		<tr><td><h2>Patient ID: </td><td><input type="text" name="pid" placeholder="Eg:1" class="me"></td></tr>
		<tr><td><h2>patient E-Mail </td><td><input type="text" name="email" placeholder="Eg:re2@gmail.com" class="me"></td></tr>
		<tr><td><h2>Medicine 1: </td><td><input type="text" name="med1" class="me"></td></tr>
		<tr><td><h2>Medicine 2: </td><td><input type="text" name="med2" class="me"></td></tr>
		<tr><td><h2>Medicine 3: </td><td><input type="text" name="med3" class="me"></td></tr>
		<tr><td><h2>Other Medicines: </td><td><input type="text" name="ot" class="me"></td></tr>
		
	</table>
	<button class="bttn2">Send Prescription</button>
	</form>
	
</center>
</body>
</html>