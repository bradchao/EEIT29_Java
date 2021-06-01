package tw.org.iii.java;

import java.io.File;

public class Brad58 {

	public static void main(String[] args) {
		// 請問一下 所以equals比較的是File(pathname) 是否完全一致嗎? 
		// 雖然file2跟file1的路經相同，
		// 但是因為pathname不一樣，所以equals就會是false?
		
		File file1 = new File("dir2/iii.txt");
		File file2 = new File("./dir2/iii.txt");
		File file3 = new File("/Users/brad/git/repository2/Java2021/dir2/iii.txt");
		File file4 = new File("dir2/iii.txt");
		
		System.out.println(file1 == file2);
		System.out.println(file2 == file3);
		System.out.println(file3 == file1);
		System.out.println(file1 == file4);
		System.out.println("----");
		System.out.println(file1.equals(file2));
		System.out.println(file2.equals(file3));
		System.out.println(file1.equals(file3));
		System.out.println(file1.equals(file4));
		System.out.println("----");
		System.out.println(file2.compareTo(file1));
		System.out.println("----");
		System.out.println(file1.getAbsolutePath());
		System.out.println(file2.getAbsolutePath());
		System.out.println(file3.getAbsolutePath());
		System.out.println(file4.getAbsolutePath());
		
	}

}
