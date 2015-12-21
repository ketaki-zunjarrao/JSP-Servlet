package com.techlabs.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlabs.service.CustomerService;
import com.techlabs.service.CustomerjdbcServices;

//@WebServlet("/editcustomercontroller")
public class EditCustomerController extends HttpServlet {

	public EditCustomerController() {
		System.out.println("EditCustomerController Initialized");
	}

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String id, name, location;
		id = request.getParameter("id");
		name = request.getParameter("name");
		location = request.getParameter("location");
		System.out.println(id + " " + name + " " + location);
		System.out.println("In do get of Edit Controller");
		 CustomerService customerService = new CustomerService();
		//CustomerjdbcServices customerService = new CustomerjdbcServices();
		customerService.editCustomer(id, name, location);
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println("In doGet");
		// response.sendRedirect("customerview.jsp");
		response.sendRedirect("http://localhost:8080/customer-mvc-app/customerview");
	}

}
