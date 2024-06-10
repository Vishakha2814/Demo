<%@page import="com.sun.glass.ui.Menu"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@include file="menu.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>new registration</title>
</head>
<body>
<h2>Register Here</h2>
<div>
<%
	if(request.getAttribute("error")!=null){
		out.println(request.getAttribute("msg"));
	}
%>
</div>
<form action="newReg" method="post">
	
	<table>
 	<tr>
 		<td>name:</td>
 		<td><input type="text" name="name"/></td>
 	</tr>
 	<tr>
 		<td>emailid:</td>
 		<td><input type="text" name="emailid"/></td>
 	</tr>
 	<tr>
 		<td>password:</td>
 		<td><input type="password" name="password"/></td>
 	</tr>
 	<tr>
 		<td>city:</td> 
 		<td><input type="text" name="city"/></td>
 	</tr>
 	<tr>
 		<td>phone:</td> 
 		<td><input type="text" name="phone"/></td>
 	</tr> 
 	<tr>
 		<td><input type="submit" value="save"/></td>
 	</tr>
 		</table>
 	</form>

</body>
</html>