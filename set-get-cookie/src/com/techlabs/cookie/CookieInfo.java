package com.techlabs.cookie;

public class CookieInfo {
	String name, location, color;

	public CookieInfo(String name, String location, String color) {
		this.color = color;
		this.location = location;
		this.name = name;
	}

	@Override
	public String toString() {
		return String.format("Name: %s]t Loation: %s,  Color: color", name,
				location, color);
	}

}
