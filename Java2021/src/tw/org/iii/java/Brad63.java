package tw.org.iii.java;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Brad63 {

	public static void main(String[] args) {

		try {
			FileReader reader = new FileReader("dir2/iii.txt");
			int c;
			while ( (c = reader.read()) != -1) {
				System.out.print((char)c);
			}
			
			reader.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}

}
