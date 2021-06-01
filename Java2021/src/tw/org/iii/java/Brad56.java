package tw.org.iii.java;

import java.io.File;

public class Brad56 {

	public static void main(String[] args) {
		// ./dir3
		
		//mkdir() 和 mkdirs() 的差別可以再說一次嗎
		// mkdir / mkdir -p
//		File dir3 = new File("dir3/dir4/dir5/dir6");
		File dir3 = new File("c:/test1/dir1");	// "./brad" => "brad"
		if (dir3.exists()) {
			System.out.println("dir3 exist");
		}else {
			if (dir3.mkdirs()) {
				System.out.println("Create dir3 Success.");
			}else {
				System.out.println("Create dir3 failure");
			}
		}
		
	}

}
