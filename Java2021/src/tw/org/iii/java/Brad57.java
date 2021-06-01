package tw.org.iii.java;

import java.io.File;
import java.io.IOException;

public class Brad57 {

	public static void main(String[] args) {
		// dir2/iii.txt
		File file = new File("dir2/iii.txt");
		if (!file.exists()) {
			try {
				if (file.createNewFile()) {
					System.out.println("OK");
				}else {
					System.out.println("XX");
				}
			}catch(IOException ie) {
				System.out.println(ie.toString());
			}
		}
	}

}
