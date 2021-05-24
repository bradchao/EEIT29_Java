package tw.org.iii.java;

public class Brad20 {

	public static void main(String[] args) {

		for (int j=0; j<10; j++) {
			for (int i=1; i<=10; i++) {
				int k = i + j * 10;
				
				// k => 質數?
				boolean isPrime = true;
				for (int m = 2; m<k; m++) {
					if (k % m == 0) {
						// 檢查到了, 被某數給整除, 所以不是質數
						isPrime = false;
						break;
					}
				}
				
				System.out.print(k + (isPrime?"*":" ")  + " ");
			}
			System.out.println();
		}
		
	}

}
