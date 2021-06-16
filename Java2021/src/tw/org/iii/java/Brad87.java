package tw.org.iii.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;

public class Brad87 {

	public static void main(String[] args) {
		try {
			String url = "jdbc:mysql://localhost:3306/iii";
			Properties prop = new Properties();
			prop.put("user", "root");
			prop.put("password", "root");
			Connection conn = DriverManager.getConnection(url, prop);
			
			Statement stmt = conn.createStatement();
			
//			String sql = "INSERT INTO cust (cname,tel,birthday) VALUES ('test1','321','1999-09-08'),('test2','321','1999-09-08')";
//			String sql = "DELETE FROM cust WHERE cname LIKE 'b%'";
			String sql = "UPDATE cust SET tel = '111' WHERE id  = 3";
			
			
			int count = stmt.executeUpdate(sql);
			System.out.println(count);
			
			System.out.println("OK");
			
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}

}
