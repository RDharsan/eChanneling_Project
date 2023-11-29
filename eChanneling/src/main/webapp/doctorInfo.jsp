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
<div align="center">
<table >	
	<c:forEach var="doc" items="${docDetails}">
	
	<c:set var="id" value="${doc.id}"/>
	<c:set var="name" value="${doc.name}"/>
	<c:set var="email" value="${doc.email}"/>
	<c:set var="spec" value="${doc.specialization}"/>
	<c:set var="phone" value="${doc.phone}"/>
	<c:set var="dob" value="${doc.dOB}"/>
	<c:set var="nic" value="${doc.nic}"/>
	<c:set var="branch" value="${doc.branch}"/>
	<c:set var="pass" value="${doc.password}"/>
	
	<h1>Login Successfully Done</h1>
		<h2>Dr. ${doc.getName()} 's Details</h2>
		
		
		<tr><td>Id</td><td>:${doc.getId()}</td></tr>
		<tr><td>Name</td><td>:${doc.name}</td></tr>
		<tr><td>Email</td><td>:${doc.email}</td></tr>
		<tr><td>Specialization</td><td>:${doc.specialization}</td></tr>
		<tr><td>ContactNo</td><td>:${doc.phone}</td></tr>
		<tr><td>DOB</td><td>:${doc.dOB}</td></tr>
		<tr><td>NIC</td><td>:${doc.nic}</td></tr>
		<tr><td>Branch</td><td>:${doc.branch}</td></tr>
		<tr><td>Password</td><td>:${doc.password}</td></tr>
				
	</c:forEach>
		</table>
	
	<c:url value="updatedoctor.jsp" var="docupdate">
		<c:param name="id" value="${id}" />
		<c:param name="name" value="${name}" />
		<c:param name="email" value="${email}" />
		<c:param name="spec" value="${spec}" />
		<c:param name="phone" value="${phone}" />
		<c:param name="dob" value="${dob}" />
		<c:param name="nic" value="${nic}" />
		<c:param name="branch" value="${branch}" />
		<c:param name="Dpass" value="${pass}" />
	</c:url>
		
		<a href="${docupdate}">
		<br><button class="bttn2">Update My Profile</button>	
		</a>
		<a href="enterpid.jsp">
<button class="bttn2" name="bt2">View Patient Symtoms</button>
</a>
</div>


</body>
</html>