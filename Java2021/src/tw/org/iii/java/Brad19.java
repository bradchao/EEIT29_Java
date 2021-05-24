package tw.org.iii.java;

public class Brad19 {

	public static void main(String[] args) {

		for (int i=1; i<= 100; i++) {
			// i => 質數?
			boolean isPrime = true;
			for (int j = 2; j<i; j++) {
				if (i % j == 0) {
					// 檢查到了, 被某數給整除, 所以不是質數
					isPrime = false;
					break;
				}
			}
			
			System.out.print(i + (isPrime?"*":" ")  + " ");
			if (i % 10 == 0) {
				System.out.println();
			}
		}
		
	}

}
