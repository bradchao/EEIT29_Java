package tw.org.iii.myclass;

public class Car extends Object {
	private int tire;
	
//	public Car() {
//		// super();
//		System.out.println("Car()");
//		tire = 4;
//	}
	public Car(int tire) {
		System.out.println("Car(int)");
		this.tire = tire;
	}
	
	public int getTire() {return tire;}
}
