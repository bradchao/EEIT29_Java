package tw.org.iii.java;

public class Brad28 {

	public static void main(String[] args) {
		int[][][] a = {
				{{1,2,3},{4,6}},
				{{11,33},{44,55,66,77}},
				{{123,456,789}},
				{{1,2,3,4,5},{6,7,8,9,10},{123}}
		};
		
		int[] b1 = {1,2,3,};
		int[][] b2 = { {}, {}, {},};
		int[][][] b3 = {{{},{}},{{},{},{}},{{},{}},{{},{},{}},};
		
		for (int[][] v : a) {
			for (int[] vv : v) {
				for (int vvv : vv) {
					System.out.print(vvv + "  ");
				}
				System.out.println();
			}
			System.out.println("----------");
		}
		// 老師 請問一下 範例28的陣列應該是幾乘幾乘幾的陣列? int[][][]a 這中括號各自應該是多少?
		
	}

}
