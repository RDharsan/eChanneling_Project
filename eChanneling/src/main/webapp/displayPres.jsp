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
	<c:forEach var="pres" items="${presDetails}">
	
	<c:set var="id" value="${pres.id}"/>
	<c:set var="pid" value="${pres.pid}"/>
	<c:set var="email" value="${pres.email}"/>
	<c:set var="med1" value="${pres.med1}"/>
	<c:set var="med2" value="${pres.med2}"/>
	<c:set var="med3" value="${pres.med3}"/>
	<c:set var="oth" value="${pres.oth}"/>
		
	<h1>Prescription Details</h1>
	<tr><td>Prescription Id</td><td>:${pres.id}</td></tr>
	<tr><td>Patient ID</td><td>:${pres.pid}</td></tr>
	<tr><td>Patient E-mail </td><td>:${pres.email}</td></tr>
	<tr><td>Medicine 1 </td><td>:${pres.med1}</td></tr>
	<tr><td>Medicine 2</td><td>:${pres.med2}</td></tr>
	<tr><td>Medicine 3</td><td>:${pres.med3}</td></tr>
	<tr><td>Other Medicine </td><td>:${pres.oth}</td></tr>
	</c:forEach>
</table>

<c:url value="updatePrescription.jsp" var="presupdate">
		<c:param name="id" value="${id}" />
		<c:param name="pid" value="${pid}" />
		<c:param name="email" value="${email}" />
		<c:param name="med1" value="${med1}" />
		<c:param name="med2" value="${med2}" />
		<c:param name="med3" value="${med3}" />
		<c:param name="oth" value="${oth}" />

	</c:url>
<a href="${presupdate}">
		<br><button class="bttn2">Update Prescription</button>	
		</a>



<a href="enterpid.jsp">
<button class="bttn2">Back</button>
</a>


<c:url value="deleteprescription.jsp" var="presdelete">
		<c:param name="id" value="${id}" />
		<c:param name="pid" value="${pid}" />
		<c:param name="email" value="${email}" />
		<c:param name="med1" value="${med1}" />
		<c:param name="med2" value="${med2}" />
		<c:param name="med3" value="${med3}" />
		<c:param name="oth" value="${oth}" />
</c:url>
<a href="${presdelete}">
<input type="button" name="delete" value="Delete Prescription" class="bttn2">
</a>
</center>
</body>
</html>