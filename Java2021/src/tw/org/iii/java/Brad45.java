package tw.org.iii.java;

import tw.org.iii.myclass.TWId;

public class Brad45 {

	public static void main(String[] args) {
		TWId id1 = new TWId(false, 0);
		// 老師，想問一下，以下的程式碼
		// 是不是在字串池(String Pool)中建了三個字串物件 "A"、"B"、"C"
		StringBuilder sb = new StringBuilder();
		sb.append("A").append("B").append("C");
		
		// 如果只有單個字，那改成這樣會比較好嗎
		StringBuilder sb2 = new StringBuilder();
		sb2.append('A').append('B').append('C');
		
		// TWId的第30行如果回圈跑到最後才通過的話，會產生10個string存在string pool?
	}

}
