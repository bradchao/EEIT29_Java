package tw.org.iii.myclass;

public class TWId extends Object{
	private String id;
	private static final String letters = "ABCDEFGHJKLMNPQRSTUVXYWZIO";
	
	// 老師this可以在講一次嗎
	// id1 id2 id3 id4 是代表什麼？
	// TWId id2 = new TWId(2); 想問一下 TWId(2) 在 TWId內是怎麼運作的
	
	// 第一個建構式裡的敘述this ((int)(Math.random()*2) == 0); 
	// 電腦怎麼知道去對應isMale 或 area 
	// 假如第一個建構式改寫成this((int)(Math.random()*26) );
	
	// 以第一個建構式()呼叫第二個(booelan)第二個又呼叫第四個是嗎
	
	// 我昨天試著把static checkID方法裡面的"boolean isCheckOk = false"
	// 拿到與private String id 同層級宣告成
	// "private static boolean isCheckOk = false"，
	// 想請問為何這樣子產生的身分證會無法通過驗證碼測試?
	
	// 為什麼是用 TwId(boolean isMale) 執行 26個亂數(區域)，
	// 而不是public TwId(int area) 執行
	
	// 請問一下 那因為現在第二個建構式裡面是布林，
	// 所以就不能再有另一個建構式是只有布林的嗎? => Yes
	// 因為這樣會不知道要去呼叫哪個建構式嗎?
	
	// 那建立物件的時候不論是用第2或3個建構式建立的時候，
	// 他們只是接收參數，實際上都用第4個建立嗎
	
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
		String id0 = letters.substring(area, area+1);
		String id1 = isMale ? "1" : "2";
		String temp = id0 + id1;
		// A1 2345678 9
		for (int i=0; i<7; i++) {
			temp += (int)(Math.random()*10);
		}
		
		for (int i=0; i<10; i++) {
			if (checkID(temp + i)) {
				id = temp + i;
				break;
			}
		}
	}
//	public TWId(String id) {
//		this.id = id;
//	}

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
