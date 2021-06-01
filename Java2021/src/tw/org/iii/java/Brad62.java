package tw.org.iii.java;

import java.io.File;
import java.io.FileInputStream;

public class Brad62 {

	public static void main(String[] args) {
		// binary file / text file
		File file  = new File("dir2/brad.jpg");
		long len = file.length();
		try {
			FileInputStream fin = new FileInputStream(file);
			byte[] buf = new byte[(int)len];	// array 元素個數 => int => 2G
			fin.read(buf);
			System.out.println(new String(buf));
			
			fin.close();
			
			//System.out.println("OK");
		} catch (Exception brad) {
			System.out.println(brad);
		}
	}

}
