<%@page import="com.sun.corba.se.spi.orbutil.fsm.Guard.Result"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.ResultSet"%>
<%@include file="menu.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>All Reg</title>
</head>
<body>
	<h2>All Registration!</h2>
	
	<table border='1'>
		<tr>
			<th>Name</th>
			<th>emailid</th>
			<th>password</th>
			<th>city</th>
			<th>phone</th>
			<th>delete</th>
		</tr>
		<%
			ResultSet results = (ResultSet)request.getAttribute("res");
			while(results.next()){
		%>
		<tr>
			<td><%=results.getString(1)%></td>
			<td><%=results.getString(2)%></td>
			<td><%=results.getString(3)%></td>
			<td><%=results.getString(4)%></td>
			<td><%=results.getString(5)%></td>
			<td><a href="deleteStudent?emailid=<%=results.getString(2)%>">Delete</a></td>
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>