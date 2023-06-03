package com.fusion.institute.core.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtility {

	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		//Register the Driver class
		Class.forName("com.mysql.cj.jdbc.Driver");
		//Create connection
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/practice", "root", "admin");
		// Statement stmt = con.createStatement();
	}

}
