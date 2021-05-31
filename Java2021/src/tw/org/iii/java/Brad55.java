package tw.org.iii.java;

import java.io.File;

public class Brad55 {

	public static void main(String[] args) {
		String path = "dir1/brad02.txt";
		// File => file or path or directory or folder
		File f1 = new File(path);		
		if (f1.exists()) {
			System.out.println("OK");
			if (f1.isDirectory()) {
				System.out.println("dir");
			}else if (f1.isFile()){
				System.out.println("file");
			}
		}else {
			System.out.println("XX");
		}
		
	}

}
