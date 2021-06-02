package tw.org.iii.java;

import java.util.LinkedList;

public class Brad73 {

	public static void main(String[] args) {
		// List
		// 1. 可以重複
		// 2. 有順序性, index => 很像陣列 => 差異在元素個數可以隨時增減
		// LinkedList / ArrayList
		// StringBuffer / StringBuilder
		
		LinkedList<String> names = new LinkedList<>();
		names.add(0,"Brad");
		names.add(0,"Andy");
		names.add(0,"Peter");
		names.add(0,"Mary");
		names.add(0,"Tony");
		names.add(0,"John");
		names.add(0,"Brad");
		System.out.println(names);
		System.out.println(names.get(4));
		System.out.println("----");
		for (int i=0; i<names.size(); i++) {
			System.out.println(names.get(i));
		}
		
		
	}

}
