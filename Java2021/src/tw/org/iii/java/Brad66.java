package tw.org.iii.java;

import java.io.FileWriter;
import java.io.IOException;

public class Brad66 {

	public static void main(String[] args) {
		
		try {
			FileWriter writer = new FileWriter("dir2/brad3.txt", true);
			
			writer.write("1234567");
			//writer.append("Hello, Brad");
			
			writer.flush();
			writer.close();
			System.out.println("OK");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
