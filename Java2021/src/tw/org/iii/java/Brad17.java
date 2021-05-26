package tw.org.iii.java;

public class Brad17 {

	public static void main(String[] args) {

		int a = 1;
		
		for (header() ; a < 10 ; footer()) {
			System.out.println("Hello, World " + a++);
		}
		
		System.out.println("end :" + a);
		
		
	}
	
	static void header() {
		System.out.println("I am Brad");
	}
	
	static void footer() {
		System.out.println("------");
		System.out.println("******");
	}
	
	

}
