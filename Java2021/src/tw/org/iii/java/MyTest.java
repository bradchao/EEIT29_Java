package tw.org.iii.java;

import tw.org.iii.myclass.Bike;
import tw.org.iii.myclass.TWId;

public class MyTest {

	public static void main(String[] args) {
		Bike b1 = new Bike();
		TWId id1 = new TWId();
		TWId id2 = new TWId(true);
		TWId id3 = new TWId(14);
		TWId id4 = new TWId(false, 12);
		System.out.println(id1.getId());
		System.out.println(id2.getId());
		System.out.println(id3.getId());
		System.out.println(id4.getId());
		
		TWId id5 = TWId.createTWId("A123456787");
		if (id5 != null) {
			System.out.println(id5.getId());
		}else {
			System.out.println("xxxxxxx");
		}
		
		
		
		
	}
}
		

