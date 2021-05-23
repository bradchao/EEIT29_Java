package tw.org.iii.java;

import java.util.Scanner;

public class Brad04 {

	public static void main(String[] args) {
		
		byte a = 10;
		short b = 3;
		int c = a + b;
		// + - * / % => byte, short, int => int
		
		a++;
		System.out.println(a);
		++a;
		System.out.println(a);	//12
		System.out.println(a++);
		System.out.println(a); // 13
		System.out.println(++a);
		
		a = 127;
		System.out.println(a);
		a++;
		System.out.println(a);
		a = 127;
		// a = a + 1;
		a += 3;	// =,  += 指派
		System.out.println(a);
		
		
		
	}

}
