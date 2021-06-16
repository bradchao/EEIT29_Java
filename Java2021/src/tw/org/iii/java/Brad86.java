package tw.org.iii.java;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Brad86 {

	public static void main(String[] args) {
		
		try {
			InetAddress ip = InetAddress.getByName("localhost");
			System.out.println("OK1");
			
			
			Socket socket = new Socket(ip, 8889);
			System.out.println("OK2");
			socket.close();
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			//e.printStackTrace();
			System.out.println(e.toString());
		}
		
	}

}
