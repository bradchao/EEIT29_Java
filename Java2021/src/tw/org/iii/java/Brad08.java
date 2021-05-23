package tw.org.iii.java;

public class Brad08 {

	public static void main(String[] args) {

		//double temp = Math.random() * 101;	// OK
		//System.out.println(temp);
		// 0.0 <= x < 1.0
		// 0.0 <= x < 101.0
		// 0.0, 0.1, 0.2, ...0.9 => 0
		// 1.0, 1.1, 1.2, ...1.9 => 1
		// 100.0, 100.1, 100.2, ... => 100
		// 0 ~ 100
		
		// 0 - 100 => 101 個值, 從 0 開始的整數
		
		int score = (int)(Math.random()*101);

		
		System.out.println(score);
		
		if (score >= 60) {
			System.out.println("Pass");
		}else {
			System.out.println("Down");
		}
		
	}

}
