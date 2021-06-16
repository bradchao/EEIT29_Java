package tw.org.iii.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Brad85 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("OK1");
		} catch (ClassNotFoundException e) {
			System.out.println(e.toString());
		}
		
		try {
			// Url
			String url = "jdbc:mysql://localhost:3306/?user=root&password=root";
			Connection conn =  DriverManager.getConnection(url);
			Statement stmt =  conn.createStatement();
			
			String sql = "CREATE DATABASE brad";
			if (stmt.execute(sql)) {
				System.out.println("QUERY");
			}else {
				System.out.println("UPDATE");
			}
			
			System.out.println("OK2");
		} catch (SQLException e) {
			System.out.println(e.toString());
		}
		
	}

}
