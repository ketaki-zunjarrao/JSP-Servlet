package com.techlabs.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Enumeration;
import java.util.Properties;

public class LoginService {
	public LoginService() {
		System.out.println("Login Service initialize");
	}

	public boolean isValid(String name) {
		File file = new File("C:/log.properties");
		try {
			FileInputStream fileInputStream = new FileInputStream(file);
			Properties properties = new Properties();
			properties.load(fileInputStream);
			fileInputStream.close();
			Enumeration enumeration = properties.keys();
			// String key=properties.getProperty(name);

			while (enumeration.hasMoreElements()) {
				String key = (String) enumeration.nextElement();
				String value = properties.getProperty(key);
				if (key.equals(name) ) 
				{
					return true;
				}
			}

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return false;
	}
}
