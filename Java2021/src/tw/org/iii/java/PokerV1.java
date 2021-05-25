package tw.org.iii.java;

public class PokerV1 {

	public static void main(String[] args) {
		int nums = 52;
		// Step1 洗牌
		long start = System.currentTimeMillis();	// 
		int[] poker = new int[nums]; // poker[0] = 0, poker[1] = 0, .... poker[51] = 0;
		for (int i=0; i<poker.length; i++) {
			int rand = (int)(Math.random()*nums);	// 0 - 51
			
			// 檢查站 => 是否重複
			boolean isRepeat = false;
			for (int j = 0; j < i; j++) {
				if (poker[j] == rand) {
					isRepeat = true;
					break;
				}
			}
			
			// !非 => true => false
			// ! => false => true
			if (!isRepeat) {
				poker[i] = rand;
				System.out.println(poker[i]);
			}else {
				i--;
			}
		}
		System.out.println("-----");
		System.out.println(System.currentTimeMillis() - start);
		
		// Step2 發牌 => 四個玩家
		
		// Step3 攤牌 => 理牌
	}

}
