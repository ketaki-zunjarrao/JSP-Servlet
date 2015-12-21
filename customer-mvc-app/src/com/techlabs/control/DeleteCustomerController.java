package com.techlabs.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlabs.service.CustomerService;
import com.techlabs.service.CustomerjdbcServices;

/**
 * Servlet implementation class EditCustomerController
 */
// @WebServlet("/deletecustomer")
public class DeleteCustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public DeleteCustomerController() {
		System.out.println("DeleteCustomerController Initialized");
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		System.out.println(id);
		CustomerService customerService = new CustomerService();
		//CustomerjdbcServices customerService = new CustomerjdbcServices();
		customerService.deleteCustomer(id);
		response.sendRedirect("http://localhost:8080/customer-mvc-app/customerview");
	}

}
