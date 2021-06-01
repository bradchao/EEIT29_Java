package tw.org.iii.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Brad59 {

	public static void main(String[] args) {
		// 想問沒有做 fin.close() 會發生什麼情況
		// 可以這麼說嗎? 
		// 通常處理各種exception  就是catach最後放(Exception e) 可以處理全部的exception?
		try {
			FileInputStream fin = new FileInputStream("dir2/iii.txt");
			fin.close();
			System.out.println("OK");
//		} catch (FileNotFoundException e) {
//			System.out.println(e.toString());
			
//		} catch (IOException e) {
//			System.out.println(e.toString());

		} catch (Exception e) {
			System.out.println(e.toString());
		}
	
	
	}

}
