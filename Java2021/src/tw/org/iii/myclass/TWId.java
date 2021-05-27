package tw.org.iii.myclass;

public class TWId {
	private String id;
	
	public TWId() {
		
	}
	public TWId(boolean isMale) {
		
	}
	public TWId(int area) {
		
	}
	public TWId(boolean isMale, int area) {
		
	}
//	public TWId(String id) {
//		this.id = id;
//	}

	public static boolean checkID(String id) {
		// 1. 長度 = 10
		// 2. 第一碼 ABC...XYZ
		// 3. 第二碼 1, 2
		// 4. 第 3 - 10 碼: 0 - 9
		boolean isCheckOK = false;
		String letters = "ABCDEFGHJKLMNPQRSTUVXYWZIO";
		if (id.matches("[A-Z][12][0-9]{8}")) {
			// 驗證碼程序
			char c1 = id.charAt(0);
			int n12 = letters.indexOf(c1) + 10;
			int n1 = n12 / 10;	// 13 / 10 => 1
			int n2 = n12 % 10;	// 13 % 10 => 3
			int n3 = Integer.parseInt(id.substring(1, 2));
			int n4 = Integer.parseInt(id.substring(2, 3));
			int n5 = Integer.parseInt(id.substring(3, 4));
			int n6 = Integer.parseInt(id.substring(4, 5));
			int n7 = Integer.parseInt(id.substring(5, 6));
			int n8 = Integer.parseInt(id.substring(6, 7));
			int n9 = Integer.parseInt(id.substring(7, 8));
			int n10 = Integer.parseInt(id.substring(8, 9));
			int n11 = Integer.parseInt(id.substring(9, 10));
			
			int sum = n1*1 + n2*9 + n3*8 + n4*7 + n5*6 +
					n6*5 + n7*4 + n8*3 + n9*2 + n10*1 + n11*1;
			isCheckOK = sum % 10 == 0;
		}
		
		return isCheckOK;
	}
	
}
