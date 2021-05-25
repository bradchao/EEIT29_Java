package tw.org.iii.java;

import tw.org.iii.myclass.Bike;

public class Brad31 {

	public static void main(String[] args) {
		Bike b1;	// 宣告為 Bike 類別的物件名稱為 b1
		b1 = new Bike();	// b1 物件進行初始化
		Bike b2 = new Bike();
		
		System.out.println(b1.speed);
		System.out.println(b2.speed);
		
		b1.upSpeed(); b1.upSpeed(); b1.upSpeed();
		System.out.println(b1.speed);
		b2.upSpeed(); b2.downSpeed(); b2.upSpeed(); b2.upSpeed();
		System.out.println(b2.speed);
		
		
		
	}

}
