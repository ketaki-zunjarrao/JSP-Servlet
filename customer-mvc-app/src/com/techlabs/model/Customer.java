package com.techlabs.model;

public class Customer {
	String id, name, location;

	/**
	 * @param id
	 * @param name
	 * @param location
	 */
	public Customer(String id, String name, String location) {
		this.id = id;
		this.location = location;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return String.format("ID: %s  \t Name: %s   \t Location:%s ", id, name,
				location);
	}

}
