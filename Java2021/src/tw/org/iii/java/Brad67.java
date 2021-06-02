package tw.org.iii.java;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;

public class Brad67 {

	public static void main(String[] args) {
		
		try {
//			FileInputStream fin = new FileInputStream("dir1/maskdata.csv");
//			InputStreamReader ir = new InputStreamReader(fin);
//			BufferedReader reader = new BufferedReader(ir);
			
			FileReader fr = new FileReader("dir1/maskdata.csv");
			BufferedReader reader = new BufferedReader(fr);
			
			
			String line;
			
//			line = reader.readLine();
//			String[] data = line.split(",");
//			for (String item : data) {
//				System.out.println(item);
//			}
			
			while ( (line = reader.readLine()) != null) {
				String[] data = line.split(",");
				System.out.println(data[1] + " : " + data[4] + " : " + data[5]);
			}
			
			reader.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
