package tw.org.iii.java;

public class Brad64 {

	public static void main(String[] args) {
		Brad643 obj = new Brad643();
		try {
			obj.m3(-1);
			System.out.println("OK");
		}catch(Exception e) {
			e.printStackTrace();
			//System.out.println(e.toString());
		}
	}

}
class Brad641 {
	void m1(int a) throws Exception {
		if (a <0) {
			throw new Exception();
		}
	}
}

class Brad642 extends Brad641 {
	void m2(int a) throws Exception {
		m1(a);
	}
}

class Brad643 extends Brad642 {
	void m3(int a) throws Exception {
		m2(a);
	}
}
