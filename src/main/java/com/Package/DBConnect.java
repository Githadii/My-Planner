package com.Package;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	
	private static String url ="jdbc:mysql://localhost:3306/myplanner";
	private static String username ="root";
	private static String password ="githadi@123";
	private static Connection con;

	public static Connection  getConnection() {
	     
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, username, password);
			
		}
		catch(Exception e) {
			System.out.println("DataBase connection is not success!");
			
		}
		
		return con;
	}

}



