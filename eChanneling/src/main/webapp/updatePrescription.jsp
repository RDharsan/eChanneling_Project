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


<%
	String id=request.getParameter("id");
	String pid=request.getParameter("pid");
	String email=request.getParameter("email");
	String med1=request.getParameter("med1");
	String med2=request.getParameter("med2");
	String med3=request.getParameter("med3");
	String other=request.getParameter("oth");
	
%>
<center>
<form action="updatepres" method="post">
	<table>
		<tr><td>Prescription ID </td><td><input type="text" name="id" value="<%=id %>" readonly="readonly"></td></tr>
		<tr><td>Patient Appoitnment ID </td><td><input type="text" name="pid" value="<%=pid %>"></td></tr>
		<tr><td>Email </td><td><input type="text" name="email" value="<%=email%>"></td></tr>
		<tr><td>Medicine 1 </td><td><input type="text" name="med1" value="<%=med1 %>"></td></tr>
		<tr><td>Medicine 2 </td><td><input type="text" name="med2" value="<%=med2%>"></td></tr>
		<tr><td>Medicine 3 </td><td><input type="text" name="med3" value="<%=med3%>"></td></tr>
		<tr><td>Other Medicines </td><td><input type="text" name="other" value="<%=other%>"></td></tr>
		
		
		
	</table>
	<br><br><button class="bttn2" name="bt1">Save Updated Details</button>
	
</form>

</center>
</body>
</html>