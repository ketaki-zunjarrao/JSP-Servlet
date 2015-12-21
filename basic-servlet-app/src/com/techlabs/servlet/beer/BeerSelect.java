package com.techlabs.servlet.beer;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BeerSelect extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("Beer Selection Advice<br>");
		String c = req.getParameter("color");
		
		
		BeerExpert be = new BeerExpert();
		ArrayList result = be.getBrands(c);

		// out.println("<br> Got beer color " + c);

		req.setAttribute("styles", result);
		RequestDispatcher view = req.getRequestDispatcher("result.jsp");
		view.forward(req, resp);

	}

}
