package com.techlabs.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.techlabs.model.*;

public class CustomerService {

	public static final List<Customer> customers = new ArrayList<Customer>();

	static {
		customers.add(new Customer("101", "Ketaki", "Murbad"));
		customers.add(new Customer("102", "Swapnil", "Ghatkopar"));
		customers.add(new Customer("103", "Nikhil", "Andheri"));
		customers.add(new Customer("104", "Lokesh", "Mumbai"));
		customers.add(new Customer("105", "Sandesh", "New-Mumbai"));
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public void addCustomer(String id, String name, String location) {
		customers.add(new Customer(id, name, location));
	}

	public void deleteCustomer(String id) {
		System.out.println("in delete customer method");
		for (Iterator<Customer> cursor = customers.iterator(); cursor.hasNext();) {
			Customer tempCustomer = (Customer) cursor.next();
			if ((tempCustomer.getId()).equals(id)) {
				System.out.println(tempCustomer);
				customers.remove(tempCustomer);
				break;
			}

		}
	}

	public void editCustomer(String id, String name, String location) {
		System.out.println("in edit customer method");
		for (Iterator<Customer> cursor = customers.iterator(); cursor.hasNext();) {
			Customer tempCustomer = (Customer) cursor.next();
			if ((tempCustomer.getId()).equals(id)) {
				System.out.println(tempCustomer);
				tempCustomer.setLocation(location);
				tempCustomer.setName(name);
				break;
			}

		}

	}
}
