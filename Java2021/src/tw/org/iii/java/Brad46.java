package tw.org.iii.java;

public class Brad46 {

	public static void main(String[] args) {
		Brad462 obj1 = new Brad462();
		Brad463 obj2 = new Brad463();
		obj1.m1(); obj1.m2();
		System.out.println("----");
		obj2.m1(); obj2.m2();
		
	}

}

class Brad461 {
	void m1() {System.out.println("Brad461:m1()");}
	void m2() {System.out.println("Brad461:m2()");}
}

class Brad462 extends Brad461 {
	void m2() {System.out.println("Brad462:m2()");}
}

class Brad463 extends Brad461 {}
