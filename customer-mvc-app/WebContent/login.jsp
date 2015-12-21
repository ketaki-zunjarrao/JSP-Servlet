<%@page import="java.io.File"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>


<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Login</title>
</head>
<body>
	<%
		String id = request.getParameter("id");
		String name = request.getParameter("name");
	%>
	<form method="post"
		action="http://localhost:8080/customer-mvc-app/logincontroller?id=<%=id%>&name=<%=name%>">
		USERNAME: <input type="text" name="username" id="username"><br>
		<br> PASSWORD: <input type="password" name="password"
			id="password"><br> <br> <input type="submit"
			value="Log in" name="submit" id="submit">

	</form>
</body>
</html>