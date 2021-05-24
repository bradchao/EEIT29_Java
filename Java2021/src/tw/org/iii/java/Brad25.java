package tw.org.iii.java;

public class Brad25 {

	public static void main(String[] args) {
		int[][] a = new int[3][4];
		
		System.out.println(a.length);
		
		System.out.println(a[0].length);
		System.out.println(a[1].length);
		System.out.println(a[2].length);
		
		for (int i=0; i<a.length; i++) {
			for (int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

}
