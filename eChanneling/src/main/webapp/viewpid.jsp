<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="style.css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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

<center>
	<table>
		<c:forEach var="sym" items="${symDetails}">
		<h1>View Patient problem</h1>
		
		<tr><td>Patient ID:</td><td>${sym.pid}</td></tr>
		<tr><td>Name:</td><td>${sym.name}</td></tr>
		<tr><td>appointment ID:</td><td>${sym.appId}</td></tr>
		<tr><td>E-Mail:</td><td>${sym.email}</td></tr>
		<tr><td>Symptoms No1:</td><td>${sym.ps1}</td></tr>
		<tr><td>Symptoms No2:</td><td>${sym.ps2}</td></tr>
		<tr><td>Symptoms No3:</td><td>${sym.ps3}</td></tr>
		<tr><td>Symptoms No4:</td><td>${sym.ps4}</td></tr>
		<tr><td>Other Symptoms:</td><td>${sym.other}</td></tr>
		
		</c:forEach>
	</table>
			<a href="prescription.jsp">
<button class="bttn2" name="bt2">Add Prescription</button>
</a>
<a href="viewPres.jsp">
<button class="bttn2" name="bt">View Prescription</button>
</a>
</center>

</body>
</html>