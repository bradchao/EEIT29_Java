package tw.org.iii.java;

public class Brad75 {

	public static void main(String[] args) {
		Brad751 obj1 = new Brad752();
		Brad752 obj2 = new Brad752();
		
		doThing(obj2);
	}
	
	static void doThing(Brad751 brad751) {
		
	}

}
abstract class Brad751 {
	void m1() {}
	void m2() {}
	abstract void m3();
}

class Brad752 extends Brad751 {
	void m3() {}
	void m4() {}
}
