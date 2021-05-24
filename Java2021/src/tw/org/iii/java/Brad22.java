package tw.org.iii.java;

public class Brad22 {

	public static void main(String[] args) {
		// 陣列 Array => 一堆相同存取特性的值
		int[] p = new int[6];	// 6 個從 0 開始的 int 元素, 初值皆為 0
		
		for (int i=0; i<100; i++) {
			int point = (int)(Math.random()*6);	// 0 - 5
			p[point]++;
		}
		for (int i=0;i<6; i++) {
			System.out.println(String.format("%d點出現%d次", (i+1), p[i]));
		}
	}

}
