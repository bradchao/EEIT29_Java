package tw.org.iii.myclass;

public class Bike {
	// 特性 => 屬性 => Field
	public double speed;
	
	// 功能 => 方法 => Method
	public void upSpeed() {
		speed = speed < 1 ? 1 : speed * 1.2;
	}
	
	public void downSpeed() {
		speed = speed < 1 ? 0 : speed * 0.7;
	}
	
}
