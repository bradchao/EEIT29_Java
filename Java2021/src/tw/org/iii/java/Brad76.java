package tw.org.iii.java;

public class Brad76 {

	public static void main(String[] args) {
		Brad761 obj = new Brad761() {
			void m1() {
				System.out.println("OK");
			}
		};
		
		obj.m1();
		
		Brad762 obj2 = new Brad762() {

			@Override
			public void m2() {
				
			}

			@Override
			public void m3() {
				
			}
			
		};
		
		obj2.m2();
		obj2.m3();
		
		
	}

}

abstract class Brad761 {
	abstract void m1();
}

interface Brad762 {
	void m2();
	void m3();
}


