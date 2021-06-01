package tw.org.iii.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import tw.org.iii.myclass.Bike;

public class Brad61 {

	public static void main(String[] args) {
		// big5 => 2bytes => 65536 => 常用字 => 造字
		// utf8 => 3bytes => 65536 * 256 => 16,777,216
		try {
			FileInputStream fin = new FileInputStream("dir2/iii.txt");
			
			byte[] buf = new byte[3]; int len;
			while ( (len = fin.read(buf)) != -1 ) {
				System.out.print(new String(buf, 0, len));
			}
			
			fin.close();
			
			//System.out.println("OK");
		} catch (Exception brad) {
			System.out.println(brad);
		}
	}

}
