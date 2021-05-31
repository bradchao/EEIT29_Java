package tw.org.iii.java;

import tw.org.iii.myclass.TWIdV3;

public class Brad48 {

	public static void main(String[] args) {
		TWIdV3 id1 = new TWIdV3();
		TWIdV3 id2 = new TWIdV3(true);
		TWIdV3 id3 = new TWIdV3(14);
		TWIdV3 id4 = new TWIdV3(false, 12);

		System.out.println("1."  + id1.getIdAreaSex());
		System.out.println("2."  + id2.getIdAreaSex());
		System.out.println("3."  + id3.getIdAreaSex());
		System.out.println("4."  + id4.getIdAreaSex());
		
		
		TWIdV3 id5 = TWIdV3.createTWid("A123456789");
		if (id5 != null) {
			System.out.println(id5.getIdAreaSex());
		}else {
			System.out.println("xxxxxxx");
		}
	}

}
