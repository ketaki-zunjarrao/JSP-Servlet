package com.techlabs.cookie;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SetCookieController
 */
@WebServlet("/setcookiecontroller")
public class SetCookieController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SetCookieController() {
		System.out.println("SetCookie Initialized");
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String value = request.getParameter("value");
		System.out.println(name + " " + value);
		Cookie cookie = new Cookie(name, value);
		request.setAttribute("name", name);
		request.setAttribute("color", value);
		response.addCookie(cookie);
		cookie.setMaxAge(60 * 60 * 60 * 24 * 5);
		response.sendRedirect("http://localhost:8080/set-get-cookie/getcookie.jsp");

	}

}
