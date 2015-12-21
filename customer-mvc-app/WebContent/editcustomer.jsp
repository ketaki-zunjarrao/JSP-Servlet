<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit Customer</title>
</head>
<body>
	<%
		String id = request.getParameter("id");
		//out.print(id);
	%>
	<form
		action="http://localhost:8080/customer-mvc-app/editcustomercontroller"
		method="post">
		ID: <input type="text" name="id" id="id" value=<%=id%>><br>
		<br> NAME:<input type="text" name="name" id="name" required>
		<br> <br> LOCATION <input type="text" name="location"
			required> <br> <input type="submit" name="submit"
			value="submit" id="submit" align="middle">
	</form>
</body>
</html>