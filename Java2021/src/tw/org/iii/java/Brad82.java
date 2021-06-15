package tw.org.iii.java;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class Brad82 {

	public static void main(String[] args) {
		
		try {
			URL url = new URL("https://s.yimg.com/ny/api/res/1.2/A5o5VA3YZXkfYpBxdvXHhg--/YXBwaWQ9aGlnaGxhbmRlcjt3PTk2MDtoPTY0MDtjZj13ZWJw/https://s.yimg.com/uu/api/res/1.2/rGPL.HwvHVTO0U3ySpWRzg--~B/aD00MDA7dz02MDA7YXBwaWQ9eXRhY2h5b24-/https://media.zenfs.com/en/stormmediagroup.com/200633baefc41912a71f4d5ff077631c");
			HttpURLConnection conn = (HttpURLConnection)url.openConnection();
			conn.connect();
			
			BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream(new File("dir1/brad2.jpg")));
			
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
