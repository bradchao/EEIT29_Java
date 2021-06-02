package tw.org.iii.java;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import tw.org.iii.myclass.Scooter;

public class Brad68 {

	public static void main(String[] args) {
		Student s1 = new Student(90, 70, 50);
		System.out.println(s1.score());
		System.out.println(s1.avg());
		
		// 物件序列化
		try {
			FileOutputStream fout = new FileOutputStream("dir1/s1.brad");
			ObjectOutputStream oout = new ObjectOutputStream(fout);
			oout.writeObject(s1);
			fout.flush();
			fout.close();
			System.out.println("OK");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
class Student implements Serializable {
	private int ch, eng, math;
	private Scooter scooter;
	
	Student(int ch, int eng, int math){
		this.ch = ch; this.eng = eng; this.math = math;
		scooter = new Scooter();
		scooter.setGear(4);
		scooter.upSpeed();scooter.upSpeed();
		scooter.upSpeed();scooter.upSpeed();
		System.out.println(scooter.getSpeed());
	}
	double getScooterSpeed() {return scooter.getSpeed();}
	int score() {return ch + eng + math;}
	double avg() {return score() / 3.0 ;}
}

