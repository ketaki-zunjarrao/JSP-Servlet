package com.techlabs.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionServlet
 */
public class SessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SessionServlet() {
		System.out.println("SessionServlet invoked");
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession();
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");

		if (session.getAttribute("counter") == null) {
			session.setAttribute("counter", 0);
		}
		out.print("<h1> Old session counter: " + session.getAttribute("counter")
				+ "</h1>");

		session.setAttribute("counter",
				(int) session.getAttribute("counter") + 1);
		out.print("<h1>New session counter: " + session.getAttribute("counter")
				+ "</h1>");

		out.print("Session Id" + session.getId());
		
	

	}

}
