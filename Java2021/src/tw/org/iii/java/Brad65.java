package tw.org.iii.java;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Brad65 {

	public static void main(String[] args) {
		String data = "\n1234567";
		try {
			FileOutputStream fout = new FileOutputStream("dir2/brad2.txt", true);
			
			fout.write(data.getBytes());
			
			fout.flush();
			fout.close();
			System.out.println("OK");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
