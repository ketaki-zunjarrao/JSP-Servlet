package com.techlabs.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginDAO {

	Connection connection = null;
	// Statement statement;
	PreparedStatement statement = null;
	ResultSet resultSet = null;
	public String result = null;

	public LoginDAO() {
		System.out.println("Connecting to Database");

	}

	public void makeConnection(String query) {
		try {
			String dburl = "jdbc:mysql://localhost:3306/techlabs";
			String userName = "root";
			String pwd = "12345";
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Registered succesfully");
			connection = DriverManager.getConnection(dburl, userName, pwd);
			System.out.println("Connected Succesfully");
			statement = connection
					.prepareStatement("select * from users where user_id=?");
			statement.setString(1, query);
			resultSet = statement.executeQuery();
			while (resultSet.next()) {
				System.out.println(resultSet.getString(3));
				result = resultSet.getString(3);

			}

		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

	public ResultSet getResult() {
		return resultSet;
	}

}
