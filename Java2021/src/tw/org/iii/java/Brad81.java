package tw.org.iii.java;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.JarURLConnection;
import java.net.URL;
import java.net.URLConnection;

import javax.net.ssl.HttpsURLConnection;

public class Brad81 {

	public static void main(String[] args) {
		
		try {
			URL url = new URL("https://www.iii.org.tw");
			HttpURLConnection conn = (HttpURLConnection)url.openConnection();
			conn.connect();
			
			InputStreamReader ir = new InputStreamReader(conn.getInputStream());
			BufferedReader reader = new BufferedReader(ir);
			String line;
			while ( (line = reader.readLine()) != null ) {
				System.out.println(line);
			}
			
			reader.close();
			System.out.println("OK");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
