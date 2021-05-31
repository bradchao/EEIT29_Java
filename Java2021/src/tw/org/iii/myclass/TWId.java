package tw.org.iii.myclass;

public class TWId extends Object{
	private String id;
	private static final String letters = "ABCDEFGHJKLMNPQRSTUVXYWZIO";
	
	public TWId() {
		// 第一道敘述句
		// 1. super() => 隱含呼叫
		// 2. super(args)
		// 3. this(), this(args)
		this((int)(Math.random()*2) == 0);
	}
	public TWId(boolean isMale) {
		this(isMale, (int)(Math.random()*26));
	}
	public TWId(int area) {
		this((int)(Math.random()*2) == 0 , area);
	}
	public TWId(boolean isMale, int area) {
		// super();
		StringBuffer sb = new StringBuffer(letters.substring(area, area+1));
		sb.append(isMale ? "1" : "2");
		for(int i=0; i<7; i++) {
			sb.append((int)(Math.random()*10));
		}
		
		String temp = sb.toString();
		for (int i=0; i<10; i++) {
			if (checkID(temp +i)) {
				id = temp + i;
				break;
			}
		}
		
//		String id0 = letters.substring(area, area+1);
//		String id1 = isMale ? "1" : "2";
//		String temp = id0 + id1;
//		// A1 2345678 9
//		for (int i=0; i<7; i++) {
//			temp += (int)(Math.random()*10);
//		}
//		
//		for (int i=0; i<10; i++) {
//			if (checkID(temp + i)) {
//				id = temp + i;
//				break;
//			}
//		}
	}
	
	private TWId(String id) {
		this.id = id;
	}
	
	public static TWId createTWId(String id) {
		TWId twid = null;
		if (checkID(id)) {
			twid = new TWId(id);
		}
		return twid;
	}

	public String getId() {
		return id;
	}
	
	
	public static boolean checkID(String id) {
		// 1. 長度 = 10
		// 2. 第一碼 ABC...XYZ
		// 3. 第二碼 1, 2
		// 4. 第 3 - 10 碼: 0 - 9
		
		boolean isCheckOk = false;
		if (id.matches("[A-Z][12][0-9]{8}")) {
			// 驗證碼程序
			char c1 = id.charAt(0);
			int n12 = letters.indexOf(c1) + 10;
			// 老師可以請問一下第51列為甚麼要+10嗎
			
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
			isCheckOk = sum % 10 == 0;
		}
		
		return isCheckOk;
	}
	
}
