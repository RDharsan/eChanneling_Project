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

<%
	String id=request.getParameter("id");
	String name=request.getParameter("name");
	String email=request.getParameter("email");
	String spe=request.getParameter("spec");
	String phone=request.getParameter("phone");
	String dob=request.getParameter("dob");
	String nic=request.getParameter("nic");
	String branch=request.getParameter("branch");
	String pass=request.getParameter("Dpass");
%>
<center>
<form action="update" method="post">
	<table>
		<tr><td>ID </td><td><input type="text" name="did" value="<%=id %>" readonly="readonly"></td></tr>
		<tr><td>Name </td><td><input type="text" name="name" value="<%=name %>"></td></tr>
		<tr><td>Email </td><td><input type="text" name="email" value="<%=email%>"></td></tr>
		<tr><td>Specialization </td><td><input type="text" name="spe" value="<%=spe %>"></td></tr>
		<tr><td>Contact Number </td><td><input type="text" name="phone" value="<%=phone%>"></td></tr>
		<tr><td>Date of Birth </td><td><input type="text" name="dob" value="<%=dob%>"></td></tr>
		<tr><td>NIC number </td><td><input type="text" name="nic" value="<%=nic%>"></td></tr>
		<tr><td>Branch </td><td><input type="text" name="branch" value="<%=branch%>"></td></tr>
		<tr><td>Password </td><td><input type="text" name="password" value="<%=pass%>"></td></tr>
		
		
	</table>
	<br><br><button class="bttn2" name="bt1">Save Updated Details</button>
	
</form>

</center>

</body>
</html>