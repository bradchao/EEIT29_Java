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
			int n1 = n12 / 10;
			int n2 = n12 % 10;
			
			
			
			
			
			
		}
		
		return isCheckOK;
	}
	
}
