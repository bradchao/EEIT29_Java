package tw.org.iii.java;

import tw.org.iii.myclass.Bike;
import tw.org.iii.myclass.Scooter;

public class Brad32 {

	public static void main(String[] args) {
		Bike b1 = new Bike();
		Scooter s1 = new Scooter();
		
		System.out.println(b1.getSpeed());
		System.out.println(b1.getColor());
		
		System.out.println(s1.getSpeed());
		System.out.println(s1.getColor());
		System.out.println(s1.getGear());
		
		s1.setGear(1);
		s1.upSpeed(); 
		s1.setGear(2);
		s1.upSpeed(); 
		s1.upSpeed();
		System.out.println(s1.getSpeed());
		s1.downSpeed();
		System.out.println(s1.getSpeed());
	}

}
