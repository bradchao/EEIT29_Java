package tw.org.iii.myclass;

public class Bike {
	// 建構式/建構子/建構方法 Constructor
	// 進行物件的初始化程序 => 誤解: 產生物件實體
	public Bike() {
		// 此處進行物件初始化
		this.color = "Yellow";
	}
	
	// 成員 => member => 物件變數.成員(屬性或是方法)
	// 特性 => 屬性 => Field
	protected double speed;	// private(類別中) => 封裝 => protected(package 或 sub class)
	private String color = "None"; 
	
	// 功能 => 方法 => Method
	public void upSpeed() {
		speed = speed < 1 ? 1 : speed * 1.2;
	}
	
	public void downSpeed() {
		speed = speed < 1 ? 0 : speed * 0.7;
		System.out.println("OK");
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
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "I am Bike";
	}
	
}