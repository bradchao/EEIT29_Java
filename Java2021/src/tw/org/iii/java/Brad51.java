package tw.org.iii.java;

public class Brad51 {

	public static void main(String[] args) {
		//Brad511 obj1 = new Brad511();
		Brad512 obj2 = new Brad512();
		Brad511 obj3 = new Brad512();	// OK
		
	}

}

abstract class Brad511 {
	void m1() {System.out.println("Brad511:m1()");}
	void m2() {System.out.println("Brad511:m2()");}
	void m3() {System.out.println("Brad511:m3()");}
}

class Brad512 extends Brad511 {
	void m4() {System.out.println("Brad512:m4()");}
}
