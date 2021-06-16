package tw.org.iii.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Properties;

public class Brad88 {

	public static void main(String[] args) {
		try {
			String url = "jdbc:mysql://localhost:3306/iii";
			Properties prop = new Properties();
			prop.put("user", "root");
			prop.put("password", "root");
			Connection conn = DriverManager.getConnection(url, prop);
			
			String sql = "INSERT INTO cust (cname,tel,birthday) VALUES (?,?,?)";
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "Eric");
			pstmt.setString(2, "1212");
			pstmt.setString(3, "1999-03-02");
			
			int n = pstmt.executeUpdate();
			if (n == 0) System.out.println("NO data");
			
			
			System.out.println("OK");
			
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}

}
