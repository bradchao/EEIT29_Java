package tw.org.iii.java;

public class Brad39 {

	public static void main(String[] args) {
		Brad391 obj = new Brad391();
		obj.m1();
		obj.m1((byte)123);	// byte -> short -> int -> long
		obj.m1(123);
		obj.m1((byte)123, 123);
		obj.m1(123, (byte)123);
		//obj.m1((byte)123,(byte)123);
	}
}

class Brad391 {
	void m1(){System.out.println("m1()");}
	//void m1(byte a) {System.out.println("m1(byte)");}
	void m1(int a) {System.out.println("m1(int)");}
	void m1(byte a, int b) {System.out.println("m1(byte, int)");}
	void m1(int a, byte b) {System.out.println("m1(int, byte)");}
}