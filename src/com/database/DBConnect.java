package com.database;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {

	//create db connection
	private static String url = "jdbc:mysql://localhost:3306/osims";
	private static String userName = "root";
	private static String password = "6947";
	
	private static Connection con;
	
	public static Connection getConnection() {
	
		try {
			 
			Class.forName("com.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection(url,userName, password);
		}
		catch(Exception e){
			System.out.println("Database connection is not succesful");
		}
		
		return con;
	}
}
