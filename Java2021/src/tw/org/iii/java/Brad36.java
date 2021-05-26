package tw.org.iii.java;

public class Brad36 {

	public static void main(String[] args) {
		String s1 = new String();
		
		byte[] b1 = {97, 98, 99, 100, 101, 102, 103, 104};
		String s2 = new String(b1);

		byte[] b2 = {65, 66, 67, 68, 69, 70};
		String s3 = new String(b2);

		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		String s4 = new String(b1, 2, 4);
		System.out.println(s4);
		
		
		
		
		
		
	}

}
