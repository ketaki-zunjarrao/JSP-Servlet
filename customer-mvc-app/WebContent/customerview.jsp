<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="com.techlabs.model.CustomerDAO"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.techlabs.model.Customer"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Customer</title>
</head>




<body>
	<%
		String user = null;
		user = (String) session.getAttribute("user");
	%>

	<%
		if (user != null) {
	%>
	<form action="http://localhost:8080/customer-mvc-app/logoutcontroller"
		method="get">
		<h4 align="right">
			welcome:<%=user%><br> <input type="submit" value="logout"
				name="logout">
		</h4>
	</form>

	<%
		} else {
	%>
	<h4 align="right">Welcome: Admin</h4>
	<%
		}
	%>
	<h1>Custtomer List</h1>
	<a href="http://localhost:8080/customer-mvc-app/createcustomer.jsp">Click
		here to add new Customer</a>
	<br>
	<br>

	<%
		List<Customer> customerList = (List<Customer>) request
				.getAttribute("cList");
		Iterator<Customer> it = customerList.iterator();
		int i = 1;
	%>
	<table border="1">
		<tr>
			<th>Customer_Id</th>
			<th>Customer_Name</th>
			<th>Customer_Location</th>
			<th>Edit_Customer</th>
			<th>Delete_Customer</th>
			<th>Customer_Login</th>
		</tr>
		<%
			while (it.hasNext()) {
				Customer c = (Customer) it.next();
				out.print("<tr>");
				out.print("<th>" + c.getId() + "</th>");
				out.print("<th>" + c.getName() + "</th>");
				out.print("<th>" + c.getLocation() + "</th>");
				String id = c.getId();
		%>
		<th><a
			href="http://localhost:8080/customer-mvc-app/editcustomer.jsp?id=<%=c.getId()%>&name=<%=c.getName()%>loaction=<%=c.getLocation()%>">Edit</a></th>
		<th><a
			href="http://localhost:8080/customer-mvc-app/deletecustomer?id=<%=c.getId()%>">Delete</a></th>
		<th><a
			href="http://localhost:8080/customer-mvc-app/login.jsp?id=<%=c.getId()%>&name=<%=c.getName()%>">Login</a></th>
		<%
			out.print("</tr>");

				i++;
			}
		%>

	</table>
</body>
</html>