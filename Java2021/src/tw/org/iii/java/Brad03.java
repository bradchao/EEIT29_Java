package tw.org.iii.java;

import java.util.Scanner;

public class Brad03 {

	public static void main(String[] args) {
		int a, b;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("X = ");
		a = scanner.nextInt();
		
		System.out.print("Y = ");
		b = scanner.nextInt();
		
		int c1, c2, c3, c4, c5;
		c1 = a + b;
		c2 = a - b;
		c3 = a * b;
		c4 = a / b;
		c5 = a % b;		// mod 取餘數

		System.out.println(String.format("%d + %d = %d", a, b, c1));
		System.out.println(String.format("%d - %d = %d", a, b, c2));
		System.out.println(String.format("%d x %d = %d", a, b, c3));
		System.out.println(String.format("%d / %d = %d ...... %d", a, b, c4, c5));
		
	}

}
