package com.techlabs.control;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlabs.model.Customer;
import com.techlabs.service.CustomerService;
import com.techlabs.service.CustomerjdbcServices;

/**
 * Servlet implementation class CustomerViewController
 */
// @WebServlet("/customerview")
public class CustomerViewController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CustomerViewController() {
		System.out.println("CustomerViewController Initialized");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		 CustomerService cService = new CustomerService();
		//CustomerjdbcServices cService = new CustomerjdbcServices();
		List<Customer> list = cService.getCustomers();

		req.setAttribute("cList", list);

		RequestDispatcher nextPage = req
				.getRequestDispatcher("customerview.jsp");
		nextPage.forward(req, resp);
	}

}
