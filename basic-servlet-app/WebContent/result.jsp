<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">Beer Recommendation JSP</h1>
	<p>
		<%
			ArrayList styles = (ArrayList) request.getAttribute("styles");
			Iterator it = styles.iterator();
			while (it.hasNext()) {
				out.print("<br> try: " + it.next());
			}
		%>
	
</body>
</html>