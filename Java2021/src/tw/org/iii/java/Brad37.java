package tw.org.iii.java;

import tw.org.iii.myclass.Car;

public class Brad37 {

	public static void main(String[] args) {
		String s1 = "Brad";
		String s2 = "Brad";
		String s3 = "Brad3";
		String s4 = new String("Brad");
		String s5 = new String("Brad");

		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s1 == s4);
		System.out.println(s4 == s5);
		System.out.println("-------------");
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(s4.equals(s5));
		System.out.println("-------------");
		
		Car car1 = new Car();
		Car car2 = new Car();
		Car car3 = car1;
		System.out.println(car1);
		System.out.println(car2);
		System.out.println(car3);
		System.out.println("-------------");
		System.out.println(car1 == car2);
		System.out.println(car1 == car3);
		System.out.println("-------------");
		System.out.println(car1.equals(car2));
		System.out.println(car1.equals(car3));
		
		System.out.println("-------------");
		
		System.out.println(s1);
		System.out.println(s1.toString());
		
		System.out.println("-------------");
		
		System.out.println(car1);
		System.out.println(car1.toString());
		
		
		
		
		
		
	}

}
