package tw.org.iii.java;

public class Brad09 {

	public static void main(String[] args) {
		// 1 - 49 => 49 個值, 0 - 48 => 1 - 49
		int lottery = (int)(Math.random()*49 + 1);
		System.out.println(lottery);
		// 1 - 6
		int point = (int)(Math.random()*6 + 1);
		System.out.println(point);
		
	}

}
