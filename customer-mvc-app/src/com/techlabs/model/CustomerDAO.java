package com.techlabs.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerDAO {
	public Connection connection = null;
	public PreparedStatement statement = null;
	public ResultSet resultSet = null;
	static List<Customer> list;

	public CustomerDAO() {
		System.out.println("Customer DAO initializeds");
		list = new ArrayList<Customer>();
	}

	public void makeConnection() {
		try {
			String dburl = "jdbc:mysql://localhost:3306/techlabs";
			String userName = "root";
			String pwd = "12345";
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Registered succesfully");
			connection = DriverManager.getConnection(dburl, userName, pwd);
			System.out.println("Connected Succesfully");
			executeSelect();

		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void executeSelect() {
		try {
			statement = connection.prepareStatement("select * from customer");
			resultSet = statement.executeQuery();
			while (resultSet.next()) {
				list.add(new Customer(resultSet.getString(1), resultSet
						.getString(2), resultSet.getString(3)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void executeInsert(String id, String name, String location) {
		try {
			System.out.println(id + location + name);
			statement = connection
					.prepareStatement("insert into customer values(?,?,?)");
			statement.setString(1, id);
			statement.setString(2, name);
			statement.setString(3, location);
			statement.executeUpdate();
			executeSelect();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void executeDelete(String id) {
		try {
			System.out.println("executeDelete");
			statement = connection
					.prepareStatement("delete from customer where id=?");
			statement.setString(1, id);
			statement.executeUpdate();
			executeSelect();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void executeUpdate(String id, String name, String location) {
		try {
			System.out.println("in execute update method");
			System.out.println(id);
			statement = connection
					.prepareStatement("update customer set name=? where id=?");
			statement.setString(1, id);
			statement.setString(2, name);
			statement.setString(3, location);
			statement.executeUpdate();
			executeSelect();
		} catch (SQLException e) {
			e.getMessage();
			e.printStackTrace();
		}
	}

	public List<Customer> getList() {
		return list;
	}

}
