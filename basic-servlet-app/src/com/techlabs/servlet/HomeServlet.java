package com.techlabs.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HomeServlet extends HttpServlet {
	public HomeServlet() {
		System.out.println("Home servlet instantited");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("Home Servlet");
		PrintWriter writer = resp.getWriter();
		
		String name=req.getParameter("user");
		resp.setContentType("text/html");
		System.out.println(name);
		//for (int i = 0; i < 10; i++) {

			writer.print("<h>Hello   "+name);
			//writer.print("<h>Hello HomeServlet</h><br>");

	//	}
	}

}
