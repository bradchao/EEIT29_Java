package tw.org.iii.java;

import java.io.File;

public class Brad55 {

	public static void main(String[] args) {
		String path = "dir2";
		
		File file = new File(path);
		if (file.exists()) {
			System.out.println("exist");
			if (file.isDirectory()) {
				System.out.println("dir");
			}else if (file.isFile()) {
				System.out.println("file");
			}
		}else {
			System.out.println("not exist");
		}
		
		
	}

}
