package com.techlabs.control;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Driver;

@WebServlet("/CheckDbConn")
public class CheckDbConn extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CheckDbConn() {
		System.out.println("servlet checking db conn");
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println("In Post of checkdb");
		String user, pwd;
		user = request.getParameter("user");
		pwd = request.getParameter("pwd");
		String dburl = "jdbc:mysql://localhost:3306/techlabs";
		String dbuser = "root";
		String dbpwd = "12345";
		System.out.println(user + "\t" + pwd);
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			System.out.println("registering drivers");
			Connection connection = DriverManager.getConnection(dburl, dbuser,
					dbpwd);
			System.out.println(connection.getClass());
			System.out.println("Connecting to database");
			System.out.println(connection.getCatalog());
			PreparedStatement statement = null;
			statement = connection.prepareStatement("");
			System.out.println(statement.getClass());

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
