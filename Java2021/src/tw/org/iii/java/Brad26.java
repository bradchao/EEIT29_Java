package tw.org.iii.java;

public class Brad26 {

	public static void main(String[] args) {
		int[][] a = new int[3][];
		a[0] = new int[2];
		a[1] = new int[3];
		a[2] = new int[4];
		
		for (int i=0; i<a.length; i++) {
			for (int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("---");
		
		// for-each
		for (int[] brad : a) {
			for (int v : brad) {
				System.out.print(v + " ");
			}
			System.out.println();
		}
		
	}

}
