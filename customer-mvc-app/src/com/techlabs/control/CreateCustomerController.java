package com.techlabs.control;

import java.io.IOException;
import java.lang.ProcessBuilder.Redirect;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlabs.service.CustomerService;
import com.techlabs.service.CustomerjdbcServices;

/**
 * Servlet implementation class CreateCustomerController
 */
// @WebServlet("/createcustomer")
public class CreateCustomerController extends HttpServlet {

	public CreateCustomerController() {
		System.out.println("CreateCustomerController Initialized");
	}

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String id, name, location;
		id = request.getParameter("id");
		name = request.getParameter("name");
		location = request.getParameter("location");
		 CustomerService customerService = new CustomerService();
		//CustomerjdbcServices customerService = new CustomerjdbcServices();
		customerService.addCustomer(id, name, location);

		System.out.println(id + "  " + name + " " + location);
		doGet(request, response);

	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println("In doGet");
		response.sendRedirect("http://localhost:8080/customer-mvc-app/customerview");

	}

}
