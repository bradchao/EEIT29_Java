package tw.org.iii.java;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

import org.json.JSONArray;
import org.json.JSONObject;

public class Brad89 {
	static PreparedStatement pstmt;

	public static void main(String[] args) {
		try {
			String url = "jdbc:mysql://localhost:3306/iii";
			Properties prop = new Properties();
			prop.put("user", "root");
			prop.put("password", "root");
			Connection conn = DriverManager.getConnection(url, prop);
		
			String sql = "INSERT INTO food (name,address,tel,hostwords,city,town,coordinate,picurl)" + 
						" VALUES (?,?,?,?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			
			if (pstmt != null) {
				fetchFoodData();
			}else {
				System.out.println("error1");
			}
			System.out.println("finish");
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		
	}

	
	static void fetchFoodData() {
		try {
			URL url = new URL("https://data.coa.gov.tw/Service/OpenData/ODwsv/ODwsvTravelFood.aspx");
			
			HttpURLConnection conn = (HttpURLConnection)url.openConnection();
			conn.connect();
			
			InputStreamReader ir = new InputStreamReader(conn.getInputStream());
			BufferedReader reader = new BufferedReader(ir);
			String line; StringBuffer sb = new StringBuffer();
			while ( (line = reader.readLine()) != null ) {
				sb.append(line);
			}
			reader.close();
			
			parseJSON(sb.toString());
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	// 過去資料被刪除後 ID產生都是新的
	// 有方法可以將ID重新編列為1開始嗎
	
	static void parseJSON(String json) {
		try {
			JSONArray root = new JSONArray(json);
			
			for (int i=0; i<root.length(); i++) {
				JSONObject row = root.getJSONObject(i);
				String[] data = new String[8];
				
				data[0] = row.getString("Name");
				data[1] = row.getString("Address");
				data[2] = row.getString("Tel");
				data[3] = row.getString("HostWords");
				data[4] = row.getString("City");
				data[5] = row.getString("Town");
				data[6] = row.getString("Coordinate");
				data[7] = row.getString("PicURL");
				
				try {
					if (addData2Table(data) == 0) {
						throw new Exception();
					}
				}catch(Exception e) {
					System.out.println("error:" + row.toString());
				}
				
			}
			
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}
	
	static int addData2Table(String[] data) throws Exception{
		for (int i=0; i<data.length; i++) {
			pstmt.setString(i+1, data[i]);
		}
		int ret = pstmt.executeUpdate();
		return ret;
	}
	
	
	
	
}
