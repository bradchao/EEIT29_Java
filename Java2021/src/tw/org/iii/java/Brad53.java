package tw.org.iii.java;

public class Brad53 {

	public static void main(String[] args) {
		// Exception : 例外, 異常
		// Error : 錯誤
		
		int a = 10, b = 0;
		int c;
		int[] d = {1,2,3,4};
		
		try {
			System.out.println("before");
			c = a / b;
			System.out.println(c);
			System.out.println(d[3]);
		}catch(ArithmeticException e1) {
			System.out.println("e1");
		}catch(ArrayIndexOutOfBoundsException e2) {
			System.out.println("e2");
		}
		
		// Exception
		// 1. RuntimeException 
		// 2. 非 RuntimeException => Checked Exception
		
		System.out.println("after");
		
	}

}
