package tw.org.iii.java;

public class Brad49 {

	public static void main(String[] args) {
		RecShape obj1 = new RecShape(10, 3);
		System.out.println(obj1.getArea());
		System.out.println(obj1.getLength());
		
		CircleShape obj2 = new CircleShape();
		System.out.println(obj2.getArea());
		
		TriShape obj3 = new TriShape();
		System.out.println(obj3.getArea());
		
		System.out.println("-------------");
		System.out.println(sum2Shape(obj2, obj3));
		
	}

	static double sum2Shape(Shape s1, Shape s2) {
		double ret = s1.getArea() + s2.getArea();
		return ret;
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
	private double w, h;
	RecShape(double w, double h){this.w=w; this.h=h;}
	public double getArea() { 
		return w*h;
	}
	public double getLength() {
		return (w+h)*2;
	}
}
class CircleShape implements Shape {
	public double getArea() { 
		return 34;
	}
	public double getLength() {
		return 0.0;
	}
}

class TriShape implements Shape {
	public double getArea() { 
		return 45;
	}
	public double getLength() {
		return 0.0;
	}
}


