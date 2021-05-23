package tw.org.iii.java;

public class Brad10 {
	public static void main(String[] args) {
		int score = (int)(Math.random()*101);
		System.out.println(score);
		
		if (score >= 90) {
			// A
			System.out.println("A");
		}else if (score >= 80) {
			// B
			System.out.println("B");
		}else if (score >= 70) {
			// C
			System.out.println("C");
		}else if (score >= 60) {
			// D
			System.out.println("D");
		}else {
			// E
			System.out.println("E");
		}
		
		
		
		
		
	}

}

