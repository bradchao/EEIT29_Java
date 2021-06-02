package tw.org.iii.java;

import java.util.HashSet;
import java.util.Iterator;

public class Brad70 {

	public static void main(String[] args) {
		// 資料結構
		// Array => index(zero-base) => value
		// 迭代器是一種設計模式，它是一個物件，它可以遍歷並選擇序列中的物件
		// Collection => Set
		// Set:
		// 1. 元素不重複
		// 2. 沒有順序性, 與加入無關
		HashSet set = new HashSet();
		System.out.println(set.size());
		set.add("Brad");
		set.add(123);	// 123 => 自動封箱 auto-boxing => new Integer(123) 的物件實體
		System.out.println(set.size());
		set.add(456);
		set.add(123);
		set.add("Brad");
		set.add("III");
		System.out.println(set.size());
		System.out.println(set);
		System.out.println("--------------");
		Iterator it = set.iterator();
		while (it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
		System.out.println("--------------");
		for (Object obj : set) {
			System.out.println(obj);
		}
		
		
		
		
		
		

	}

}
