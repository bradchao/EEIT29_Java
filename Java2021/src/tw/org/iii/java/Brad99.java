package tw.org.iii.java;

public class Brad99 {

	public static void main(String[] args) {
		int row = 2;
		int col = 3;
		int start = 2;
		int i, j, k;
		i = j = k = 0;
		
		for (k = 0 ; k < row ; k++) {
			for (j=1; j<=9; j++) {
				// for (i = 2; i <= 5; i++)
				// 老師，可以再說明一次 i <=  col -1 那部分怎麼計算嗎
				for (i = start; i< start + col; i++) {
					int newi = i + k * col;
					int r = newi * j;
					System.out.print(String.format("%d x %d = %d\t", newi, j, r));
				}
				System.out.println();
			}
			System.out.println("---");
		}
		
		System.out.println(String.format("%d : %d : %d", i, j , k));
		

	}
	
	
	
	

}
