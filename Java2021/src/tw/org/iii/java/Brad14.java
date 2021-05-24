package tw.org.iii.java;

public class Brad14 {

	public static void main(String[] args) {
		
		byte a = 123;	// byte : -128 ~ 127
		final byte b = 11;
		
		switch (a) {	// byte, short, char, int, String, Enum
			default:
				System.out.println("XX");
				break;
			case 1:
				System.out.println("A");
				break;
			case 10:
				System.out.println("B1");
				//break;
			case b-2:
				System.out.println("B2");
				//break;
			case 127:
				System.out.println("C");
				break;

		}
		
		System.out.println("End");
		
		

		
	}

}
