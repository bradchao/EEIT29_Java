package tw.org.iii.java;

public class Brad13 {

	public static void main(String[] args) {
		int a = 10, b = 3;
		
		if (--a >= 10 || ++b <= 3) {
			System.out.println(String.format("OK : a = %d, b = %d", a, b));
		}else {
			System.out.println(String.format("XX : a = %d, b = %d", a, b));
		}
		
	}

}
