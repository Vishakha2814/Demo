<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>First jsp file</title>
</head>
<body>
	<h2>First JSP file</h2>	
	<%
			for (int x = 0; x < 5; x++) {
				out.println(x);
			}
	
	%>
	<%! 
		public int x= 10;
		public int test(){
			return x;
		}
	%>
	<%
		out.println(test());
	%>
	<%
		int z = 10;
		if (z > 100) {
			out.print("greater");
		} else {
			out.print("not greater");
		}
	%>
</body>
</html>