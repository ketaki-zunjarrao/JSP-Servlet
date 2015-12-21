package com.techlabs.control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.techlabs.service.LoginService;

//@WebServlet("/logincontroller")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginController() {
		System.out.println("Login Controller");
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		response.sendRedirect("/customer-mvc-app/customerview");

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String username = null;
		username = request.getParameter("username");

		LoginService loginService = new LoginService();
		if (loginService.isValid(username))

		{
			System.out.println("Username:" + username);
			request.setAttribute("username", username);
			HttpSession session = request.getSession();
			if (session.getAttribute(username) == null) {
				session.setAttribute("user", username);
				doGet(request, response);
			}
		}else {
			response.sendRedirect("/customer-mvc-app/login.jsp");

		}
	}
}