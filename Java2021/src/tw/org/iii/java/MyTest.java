package tw.org.iii.java;

public class MyTest {

	public static void main(String[] args) {
		// 1. A123456789
		// 2. 0931-123456
		// 3. 2021-05-27
		// 4. 10:20:30
		// 5. 04-22334567
		// 6. 192.168.3.4
		// 0 - 255 => 
		// 0 - 9 => [0-9].
		// 10 - 99 => [1-9][0-9].
		// 100 - 199 => 1[0-9]{2}.
		// 200 - 249 => 2[0-4][0-9]
		// 250 - 255 => 25[0-5]
		
		String id = "A123456789";
		
		if (id.matches("[A-Z][12][0-9]{8}")) {
			System.out.println("OK");
		}else {
			System.out.println("XX");
		}
		
		
	
	
	}
}
		

