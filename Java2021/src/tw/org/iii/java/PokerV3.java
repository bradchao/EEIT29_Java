package tw.org.iii.java;

public class PokerV3 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		int nums = 10;
		int[] poker = new int[nums];
		
		// Step0 文具行買回來
		for (int i=0; i<poker.length; i++) poker[i] = i;
		
		// Step1 洗牌
		for (int i = nums-1; i>0; i--) {
			int rand = (int)(Math.random()*(i+1));
			
			// poker[rand] <=> poker[i]
			int temp = poker[rand];
			poker[rand] = poker[i];
			poker[i] = temp;
			
		}
		
		// 洗完之後看一下
		for (int card : poker ) {
			System.out.println(card);
		}
		System.out.println("----");
		System.out.println(System.currentTimeMillis() - start);
		System.out.println("----");

		// Step2 發牌 => 四個玩家
		int[][] players = new int[4][13];
		for (int i=0; i<poker.length; i++) {
			//players[?][?] = poker[i];
		}
		
		// Step3 攤牌 => 理牌
		
		
	}

}
