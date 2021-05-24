package tw.org.iii.java;

import java.util.Scanner;

public class Brad15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Month : ");
		int month = scanner.nextInt();
		
		switch(month) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				// 31
				System.out.println("31");
				break;
			case 4: case 6: case 9: case 11:
				// 30
				break;
			case 2:
				// 28
				break;
			default:
				// xx
		}
		
		
	}

}
