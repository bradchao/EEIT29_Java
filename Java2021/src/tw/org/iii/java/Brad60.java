package tw.org.iii.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Brad60 {

	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("dir2/iii.txt");
			
			int c;
			while ( (c = fin.read()) != -1 ) {
				System.out.print((char)c);
			}
			
			fin.close();
			
			//System.out.println("OK");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
