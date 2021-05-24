package tw.org.iii.java;

public class Brad24 {

	public static void main(String[] args) {
		boolean isOK = true;
		
		int a;
		if (isOK) {
			a = 10;
		}else {
			a = 100;
		}
		
		System.out.println(a);
		System.out.println("-------------");
		
		a = isOK ? 7 : 8;
		System.out.println(a);
		
		System.out.println("-------------");
		
		int[] ary = new int[3];
		
		System.out.println(ary[0]);	
		ary[0]++;
		System.out.println(ary[0]);	
		
		
		
		
		
		
		
	}

}
