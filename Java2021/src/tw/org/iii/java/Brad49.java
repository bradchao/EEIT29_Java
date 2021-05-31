package tw.org.iii.java;

public class Brad49 {

	public static void main(String[] args) {

	}

}

// 規格
// 幾何形狀 => 1. 計算面積 2. 計算周長
// 	=> 矩形,圓形, 三角形
interface Shape {	// public
	double getArea();	// public
	double getLength();	// public
}
class RecShape implements Shape {
	public double getArea() { 
		return 0.0;
	}
	public double getLength() {
		return 0.0;
	}
}
class CircleShape implements Shape {
	public double getArea() { 
		return 0.0;
	}
	public double getLength() {
		return 0.0;
	}
}

class TriShape implements Shape {
	public double getArea() { 
		return 0.0;
	}
	public double getLength() {
		return 0.0;
	}
}


