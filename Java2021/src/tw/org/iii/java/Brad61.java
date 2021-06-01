package tw.org.iii.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import tw.org.iii.myclass.Bike;

public class Brad61 {

	public static void main(String[] args) {
		// big5 => 2bytes => 65536 => 常用字 => 造字
		// utf8 => 3bytes => 65536 * 256 => 16,777,216
		// 似乎是不滿3個byte, 就會自動填上空白湊滿3個byte?
		// 請問一下 所以第20行的意思是 每次讀取的時候 
		// 都會把陣列buf[0]裡面的內容都替換掉 換成新讀到的字元嗎?
		try {
			FileInputStream fin = new FileInputStream("dir2/iii.txt");
			
			byte[] buf = new byte[3];	// buf[0] = 1, buf[1] = 2, buf[2] = 3 
			int len;
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
