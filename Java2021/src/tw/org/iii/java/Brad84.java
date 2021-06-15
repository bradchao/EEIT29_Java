package tw.org.iii.java;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.JarURLConnection;
import java.net.URL;
import java.net.URLConnection;

import javax.net.ssl.HttpsURLConnection;

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
			System.out.println(sb.toString());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
