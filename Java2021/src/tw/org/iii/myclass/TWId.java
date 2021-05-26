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
		String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		if (id.length() == 10) {
			char c1 = id.charAt(0);
			int pos = letters.indexOf(c1);
			if (pos != -1) {
				isCheckOK = true;
			}
		}
		
		return isCheckOK;
	}
	
}
