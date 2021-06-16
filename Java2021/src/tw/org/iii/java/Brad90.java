package tw.org.iii.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

public class Brad90 {

	public static void main(String[] args) {
		try {
			String url = "jdbc:mysql://localhost:3306/iii";
			Properties prop = new Properties();
			prop.put("user", "root");
			prop.put("password", "root");
			Connection conn = DriverManager.getConnection(url, prop);
			
			int rpp = 8;	// 每頁呈現幾筆資料	row per page
			int page = 2;	// 第 n 頁
			int start = (page -1)*rpp;
			
			String sql = String.format("SELECT * FROM food ORDER BY id LIMIT %d, %d", start, rpp) ;
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();

			System.out.println(String.format("第%d頁", page));
			while (rs.next()) {
				String id = rs.getString("id");
				String name = rs.getString("name");
				String city = rs.getString("city");
				String town = rs.getString("town");
				System.out.println(id +":" + name +":" + city + town);
			}
			
			rs.close();
			
			
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}

}
