package tw.org.iii.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

import org.json.JSONStringer;
import org.json.JSONWriter;

// 老師，第三方套件提供的方法
// 可以像官方的API一樣，查他的內容和說明嗎
// JavaDoc

/**
 * 
 * @author brad
 *
 */
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

			JSONStringer js = new JSONStringer();
			JSONWriter jw = js.array();
			
			System.out.println(String.format("第%d頁", page));
			while (rs.next()) {
				String id = rs.getString("id");
				String name = rs.getString("name");
				String city = rs.getString("city");
				String town = rs.getString("town");
				System.out.println(id +":" + name +":" + city + town);
				
				jw.object();
				jw.key("id").value(id);
				jw.key("name").value(name);
				jw.key("city").value(city);
				jw.key("town").value(town);
				jw.endObject();
			}
			
			rs.close();
			
			jw.endArray();
			System.out.println(jw.toString());
			
			
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}

}
