<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method="get"
		action="http://localhost:8080/set-get-cookie/setcookie.jsp">
		<input type="submit" name="submit1" id="submit1" value="SetCookie"
			align="right">
	</form>
	<form method="get"
		action="http://localhost:8080/set-get-cookie/getcookie.jsp">
		<input type="submit" name="submit2" id="submit2" value="GetCookie"
			align="right">
	</form>
</body>
</html>