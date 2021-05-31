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
// 普通的類別和抽象類別的差異在哪裡啊?
// 介面和抽象之間的差異在哪裡啊?
// 所以抽象類別通常會用在什麼時候啊？
// 相同 => 多型
// 規格
// 幾何形狀 => 1. 計算面積 2. 計算周長
// 	=> 矩形,圓形, 三角形
interface Shape {	// public
	double getArea();	// public abstract
	double getLength();	// public abstract
}
class RecShape implements Shape {
	// 為什麼是要設定成private double w,h可以麻煩老師再說一次嗎?
	private double w, h;
	
	RecShape(double width, double height){
		w = width; 
		h = height;
	}
	
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


