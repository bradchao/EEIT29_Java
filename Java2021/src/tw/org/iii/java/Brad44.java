package tw.org.iii.java;

public class Brad44 {

	public static void main(String[] args) {
		Brad441 obj1 = new Brad442();
		Brad441 obj2 = new Brad443();
		obj1.m1();
		obj2.m1();
		
		obj1.m2();
		obj2.m2();
	}

}
// 請問一下 這樣與普通的繼承方式 然後裡面改寫方法差別在哪?
// brad@brad.tw

abstract class Brad441 {
	void m1() {System.out.println("m1()");}
	abstract void m2();
}

class Brad442 extends Brad441 {
	void m2() {
		System.out.println("Brad442:m2()");
	}
}

class Brad443 extends Brad441 {
	void m2() {
		System.out.println("Brad443:m2()");
	}
}

