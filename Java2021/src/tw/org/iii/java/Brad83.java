package tw.org.iii.java;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class Brad83 {

	public static void main(String[] args) {
		
		try {
			URL url = new URL("https://pdfmyurl.com/?url=" + "https://www.gamer.com.tw");
			HttpURLConnection conn = (HttpURLConnection)url.openConnection();
			conn.connect();
			
			BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream(new File("dir1/brad.pdf")));
			
			BufferedInputStream bin = new BufferedInputStream(conn.getInputStream());
			byte[] buf = new byte[4*1024*1024];
			int len;
			while ( (len = bin.read(buf)) != -1) {
				bout.write(buf, 0, len);
			}
			bin.close();
			
			bout.flush();
			bout.close();
			
			
			System.out.println("OK");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
