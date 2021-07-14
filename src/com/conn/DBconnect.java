package com.conn;
import java.sql.*;

public class DBconnect {
	
	private static Connection conn;
	
	public static Connection getConn() {
		try {
			if(conn==null) {
				Class.forName("com.mysql.cj.jdbc.Driver");// to load the class Driver
				String url="jdbc:mysql://localhost:3306/JDBC"; // change to Employee database	
				String uname="root";
				String pass="password";
				conn=DriverManager.getConnection(url,uname,pass);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return conn;
	}
}
