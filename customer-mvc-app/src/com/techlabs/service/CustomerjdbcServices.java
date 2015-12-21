package com.techlabs.service;

import java.util.ArrayList;
import java.util.List;

import com.techlabs.model.Customer;
import com.techlabs.model.CustomerDAO;

public class CustomerjdbcServices {
	public static CustomerDAO dao = new CustomerDAO();
	public static List<Customer> customers = new ArrayList<Customer>();

	static {

		dao.makeConnection();
		customers = dao.getList();
	}

	public CustomerjdbcServices() {

	}

	public void addCustomer(String id, String name, String location) {
		System.out.println(id);
		dao.executeInsert(id, name, location);
	}

	public void deleteCustomer(String id) {
		System.out.println("in deleteCustomer");
		dao.executeDelete(id);
	}

	public void editCustomer(String id, String name, String location) {
		System.out.println("in edit customer method");
		dao.executeUpdate(id, name, location);
	}

	public List<Customer> getCustomers() {
		return dao.getList();
	}

}
