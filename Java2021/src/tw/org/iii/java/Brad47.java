package tw.org.iii.java;

public class Brad47 {

	public static void main(String[] args) {
		Brad472 obj1 = new Brad472();
		Brad473 obj2 = new Brad473();
		obj1.m1(); obj1.m2();
		System.out.println("----");
		obj2.m1(); obj2.m2();
	}

}
// 多型
abstract class Brad471 {
	void m1() {System.out.println("Brad471:m1()");}
	abstract void m2();
}

class Brad472 extends Brad471 {
	void m2() {System.out.println("Brad472:m2()");}
}

class Brad473 extends Brad471 {
	void m2() {System.out.println("Brad473:m2()");}	
}