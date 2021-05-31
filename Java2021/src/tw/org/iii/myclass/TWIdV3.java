package tw.org.iii.myclass;

public class TWIdV3 {
	private String id;
	private String area1;
	private String isMale1;
	
	private static final String letters = "ABCDEFGHJKLMNPQRSTUVXYWZIO";

	public TWIdV3() {

		this ((int)(Math.random()*2) == 0);
		
	}
	public TWIdV3(boolean isMale) {
		this(isMale, (int)(Math.random()*26));
		
	}
	public TWIdV3(int area) {
		
		this((int)(Math.random()*2) == 0 , area);
		
	}
	public TWIdV3(boolean isMale, int area) {
		
		// super();
		StringBuffer id0=new StringBuffer(letters.substring(area, area+1));
//		String id0 = letters.substring(area, area+1);改為stringbuffer();
		StringBuffer id1=new StringBuffer( isMale ? "1" : "2");
//		String id1 = isMale ? "1" : "2";改為stringbuffer();
		StringBuffer temp=new StringBuffer();
		temp.append(id0).append(id1);
//		String temp = id0 + id1;改為stringbuffer();
//		// A1 2345678 9
		for (int i=0; i<7; i++) {
			temp.append((int)(Math.random()*10));
			
			//temp += (int)(Math.random()*10);改為stringbuffer();
		}

		for (int i=0; i<10; i++) {
			if (checkID(temp.toString()+i)) {
				id = temp.append(i).toString();
				break;
			}
		}
		//增加縣市辨識
//		String[] a= {"臺北市","臺中市","基隆市","臺南市","高雄市",
//				"新北市","宜蘭縣","桃園市","新竹縣","苗栗縣",
//				"臺中縣","南投縣","彰化縣","雲林縣","嘉義縣",
//				"臺南縣","高雄縣","	屏東縣","花蓮縣","臺東縣",
//				"澎湖縣","陽明山管理局","金門縣","連江縣","嘉義市","新竹市",};
		
		area1 = a[area];
		//增加性別辨識
		isMale1=isMale?"male":"female";
		
		
	}
	
	private TWIdV3(String id) {
		this.id = id;
		int pos = letters.indexOf(id.charAt(0)); 
		area1 = a[pos];
		isMale1= id.charAt(1) == '1'? "male":"female";
	}
	
	private static String[] a = {"臺北市","臺中市","基隆市","臺南市","高雄市",
			"新北市","宜蘭縣","桃園市","新竹縣","苗栗縣",
			"臺中縣","南投縣","彰化縣","雲林縣","嘉義縣",
			"臺南縣","高雄縣","屏東縣","花蓮縣","臺東縣",
			"澎湖縣","陽明山管理局","金門縣","連江縣","嘉義市","新竹市",};
	
	public static TWIdV3 createTWid(String id) {
		
		TWIdV3 twid=null;
		if(checkID(id)){
			twid=new TWIdV3(id);
			
		}
		return twid;
	}
	
	public String getIdAreaSex() {
		System.out.print(area1);//印出性別與縣市
		System.out.println(isMale1);
		return id;
	}

	public static boolean checkID(String id) {
		// 1. 長度 = 10
		// 2. 第一碼 ABC...XYZ
		// 3. 第二碼 1, 2
// 4. 第 3 - 10 碼: 0 - 9
		boolean isCheckOK = false;
		
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
			isCheckOK = sum % 10 == 0;//是不是0 是0=>真 不等於0=>假
			
			
		}
		
		return isCheckOK;
	}

}
