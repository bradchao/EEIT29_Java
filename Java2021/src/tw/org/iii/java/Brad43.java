package tw.org.iii.java;

public class Brad43 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println(sb);
		
		StringBuffer sb2 = sb.append("Brad");
		System.out.println(sb);
		
		System.out.println(sb == sb2);
		
		sb.append("1234567")
			.append("7654321")
			.append("abcdefg")
			.delete(4, 10);
		System.out.println(sb);
		
		
		
		
		
	}

}
