package com.techlabs.service;

import java.sql.SQLException;

import com.techlabs.dao.LoginDAO;

public class LoginCheckService {
	LoginDAO dao = new LoginDAO();

	public LoginCheckService(String query) {
		try {
			dao.makeConnection(query);
		} catch (Exception e) {
		}
		System.out.println("Login check services.....");
	}

	public boolean isValid() {
		try {
			if (!dao.getResult().next())
				return false;
			else
				return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	public String getUser() {
		return dao.result;
	}
}