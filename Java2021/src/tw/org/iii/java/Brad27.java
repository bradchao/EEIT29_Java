package tw.org.iii.java;

public class Brad27 {

	public static void main(String[] args) {
		//int[] a = new int[] {1,2,3,4};
		int[] a = {1,2,3,4};
		
//		int[] a;
//		a = new int[] {1,2,3,4};
		
//		int[] a;
//		a = {1,2,3,4}; => xxx
		
		for ( int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("---");
		
		// for-each
		for (int v : a) {
			System.out.println(v);
		}
		
		
		
		
		
		
	}

}
