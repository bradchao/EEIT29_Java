package tw.org.iii.myclass;

public class Bike {
	// 特性 => 屬性 => Field
	protected double speed;	// private(類別中) => 封裝 => protected(package 或 sub class)
	private String color = "None"; 
	
	// 功能 => 方法 => Method
	public void upSpeed() {
		speed = speed < 1 ? 1 : speed * 1.2;
	}
	
	public void downSpeed() {
		speed = speed < 1 ? 0 : speed * 0.7;
	}
	
	public double getSpeed() {
		return speed;
	}

	// Getter
	public String getColor() {
		return color;
	}

	// Setter
	public void setColor(String color) {
		// this => 本類別(Bike)所產生出來的物件實體 this
		// if (color == "Yellow" || color == "Red" ) => 不一樣
		if (color.equals("Yellow") || color.equals("Red")) {
			this.color = color;
		}
	}
	
}
