package tw.org.iii.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import tw.org.iii.myclass.Bike;

public class Brad60 {

	public static void main(String[] args) {
		// big5 => 2bytes => 65536 => 常用字 => 造字
		// utf8 => 3bytes => 65536 * 256 => 16,777,216
		try {
			FileInputStream fin = new FileInputStream("dir2/iii.txt");
			
			int c;
			while ( (c = fin.read()) != -1 ) {
				System.out.print((char)c);
			}
			
			fin.close();
			
			//System.out.println("OK");
		} catch (Exception brad) {
			System.out.println(brad);
		}
	}

}
