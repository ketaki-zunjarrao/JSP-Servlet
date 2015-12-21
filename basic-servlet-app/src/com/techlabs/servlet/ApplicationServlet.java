package com.techlabs.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ApplicationServlet
 */
public class ApplicationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		ServletContext context = request.getServletContext();
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");

		if (context.getAttribute("counter") == null) {
			context.setAttribute("counter", 0);
		}

		out.print("<h1> Old counter value" + context.getAttribute("counter")
				+ "</h1>");
		context.setAttribute("counter",
				(int) context.getAttribute("counter") + 1);
		out.print("<h1> New counter value" + context.getAttribute("counter")
				+ "</h1>");
	}
}
