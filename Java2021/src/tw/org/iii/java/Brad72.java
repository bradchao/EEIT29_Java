package tw.org.iii.java;

import java.util.HashSet;
import java.util.TreeSet;

public class Brad72 {

	public static void main(String[] args) {
		// 出樂透號碼
		TreeSet<Integer> lotterys = new TreeSet<>();
		while (lotterys.size()<6) {
			lotterys.add((int)(Math.random()*49+1));
		}
		for (Integer lottery : lotterys) {
			System.out.print(lottery + " ");
		}
		System.out.println();
		System.out.println("-------");
		
		// 開獎
		HashSet<Integer> winnums = new HashSet<>();
		while (winnums.size()<7) {
			winnums.add((int)(Math.random()*49+1));
		}
		for (Integer winnum : winnums) {
			System.out.print(winnum + " ");
		}
		
		
		
		
		
		
	}

}
