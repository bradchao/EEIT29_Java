package tw.org.iii.myclass;

public class Car extends Object {
	private int tire;
	
	public Car() {
		// super();
		System.out.println("Car()");
		tire = 4;
	}
	public Car(int tire) {
		if (tire>=0 && tire<=16) {
			System.out.println("Car(int)");
			this.tire = tire;
		}
	}
	
	public int getTire() {return tire;}
	
	@Override
	public String toString() {
		return "MyCar:" + tire;
	}
	
}
