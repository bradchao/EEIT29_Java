package tw.org.iii.java;

public class Brad77 {

	public static void main(String[] args) {
		// Thread => 執行緒
		// Multi-Thread => 多重執行緒
		// 工作管理員 => 程序 => Process
		// OS => Process => Multi-Process
		// Java Application => Thread => Multi-Thread
		
		Brad771 obj1 = new Brad771();
		Brad771 obj2 = new Brad771();
		obj1.start(); //以生命週期表表現
		obj2.start(); //以生命週期表表現
		
	}

}

class Brad771 extends Thread {
	@Override
	public void run() {
		for (int i=0; i<1000; i++) {
			System.out.println(i);
		}
	}
}
