package tw.org.iii.java;

public class Brad68 {

	public static void main(String[] args) {
		// 物件序列化

	}

}
class Student {
	private int ch, eng, math;
	Student(int ch, int eng, int math){
		this.ch = ch; this.eng = eng; this.math = math;
	}
	int score() {return ch + eng + math;}
	double avg() {return score() / 3.0 ;}
}
