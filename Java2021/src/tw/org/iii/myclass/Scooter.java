package tw.org.iii.myclass;

public class Scooter extends Bike {	
	// 表現出 繼承 特徵, Bike 為 Scooter 的父類別 super class
	// Scooter 為 Bike 的子類別 sub class

	private int gear;

	public int getGear() {
		return gear;
	}
	public void setGear(int gear) {
		if (gear >= 0 && gear <= 5) {
			this.gear = gear;
		}
	}
	
	@Override
	public void upSpeed() {
		//super.upSpeed();
		speed = (speed < 1 && gear > 0) ? 1 : speed + 3 * gear;
	}
	
	
}
