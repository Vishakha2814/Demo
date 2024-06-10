<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>login</title>
</head>
<body>
<div>
<% 
	if(request.getAttribute("error")!=null){
		out.println(request.getAttribute("error"));	
	}
%>
</div>
<form action="verifylogin" method="post">
	emailid<input type="text" name="emailid">
	password<input type="password" name="password">
	<input type="submit" value="login">
</form>
</body>
</html>