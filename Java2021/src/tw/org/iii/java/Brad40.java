package tw.org.iii.java;

public class Brad40 {

	public static void main(String[] args) {
		System.out.println(Brad401.b);
		
		Brad401 obj1 = new Brad401();
		Brad401 obj2 = new Brad401();
		
		System.out.println(obj1.a);
		System.out.println(obj2.a);
		
		System.out.println("-----");
		obj1.a = 123; obj2.a = 456;
		System.out.println(obj1.a);
		System.out.println(obj2.a);
		
		System.out.println(Brad401.b);
		System.out.println("-----");
		
		Brad401.b = 777;
		System.out.println(Brad401.b);
		System.out.println(obj1.b);
		System.out.println(obj2.b);
		
		
	}

}

class Brad401 {
	int a = 1;
	static int b = 1;
}
