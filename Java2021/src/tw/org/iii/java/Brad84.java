package tw.org.iii.java;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.JarURLConnection;
import java.net.URL;
import java.net.URLConnection;

import javax.net.ssl.HttpsURLConnection;

import org.json.JSONArray;
import org.json.JSONObject;

public class Brad84 {

	public static void main(String[] args) {
		// 想問http (明碼) 跟 https 差在哪 => s => SSL
	
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
	
	static void parseJSON(String json) {
		try {
			JSONArray root = new JSONArray(json);
			//System.out.println(root.length());
			
			for (int i=0; i<root.length(); i++) {
				JSONObject row = root.getJSONObject(i);
				String name = row.getString("Name");
				String addr = row.getString("Address");
				System.out.println(name +":" + addr);
			}
			
			
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}

}
