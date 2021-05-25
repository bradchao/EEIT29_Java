package tw.org.iii.java;

public class PokerV3 {

	public static void main(String[] args) {
		//老師請問一下V3第14行的i = nums-1是因為陣列從0開始嗎?然後random 的i+1是讓點數從1開始?
		long start = System.currentTimeMillis();
		int nums = 52;
		int[] poker = new int[nums];
		
		// Step0 文具行買回來
		for (int i=0; i<poker.length; i++) poker[i] = i;
		
		// Step1 洗牌
		// nums = 10
		// 0 - 9 => 10 個從 0 開始的整數亂數
		// 0 - 8 => 9 個從 0 開始的整數亂數
		// 0 - 7 => 8 個從 0 開始的整數亂數
		// ......
		for (int i = nums-1; i>0; i--) {
			int rand = (int)(Math.random()*(i+1));	// 產生出 (i+1) 個從 0 開始的整數亂數
			
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
			players[i%4][i/4] = poker[i];
		}

		for (int card : players[1]) {
			System.out.println(card);
		}
		
		
		// Step3 攤牌 => 理牌
		
		
	}

}
