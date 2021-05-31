package tw.org.iii.java;

public class Brad54 {
	public static void main(String[] args) {
		Bird b1 = new Bird();
		try {
			b1.setLegs(2);
		} catch (Exception e) {
		}
	}
}

class Bird {
	int legs;
	
	void setLegs(int legs) throws Exception {
		if (legs > 2 || legs < 0) {
			throw new Exception();
		}else {
			this.legs = legs;
		}
	}
}
