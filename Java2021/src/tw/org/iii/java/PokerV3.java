package tw.org.iii.java;

public class PokerV3 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		int nums = 10;
		int[] poker = new int[nums];
		
		for (int i=0; i<poker.length; i++) poker[i] = i;
		
		for (int i = nums-1; i>0; i--) {
			int rand = (int)(Math.random()*(i+1));
			
			// poker[rand] <=> poker[i]
			int temp = poker[rand];
			poker[rand] = poker[i];
			poker[i] = temp;
			
		}
		
		for (int card : poker ) {
			System.out.println(card);
		}
		System.out.println("----");
		System.out.println(System.currentTimeMillis() - start);
		
		
		
		
	}

}
