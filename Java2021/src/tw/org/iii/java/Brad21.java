package tw.org.iii.java;

public class Brad21 {

	public static void main(String[] args) {
		// 陣列 Array => 一堆相同存取特性的值
		int p1, p2, p3, p4, p5, p6;
		p1 = p2 = p3 = p4 = p5 = p6 = 0;
		
		for (int i=0; i<100; i++) {
			int point = (int)(Math.random()*6+1);
			switch(point) {
				case 1: p1++; break;
				case 2: p2++; break;
				case 3: p3++; break;
				case 4: p4++; break;
				case 5: p5++; break;
				case 6: p6++; break;
			}
		}
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		System.out.println(p5);
		System.out.println(p6);
	}

}
