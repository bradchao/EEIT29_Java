package tw.org.iii.java;

public class Brad78 {

	public static void main(String[] args) {
		Brad781 obj1 = new Brad781("A");
		Brad781 obj2 = new Brad781("B");
		
		Brad782 obj3 = new Brad782("C");
		Thread t1 = new Thread(obj3);
		
		obj1.start();
		obj2.start();
		t1.start();

		System.out.println("main");
		
	}

}

class Brad781 extends Thread {
	private String name;
	
	Brad781(String name){
		this.name = name;
	}

	@Override
	public void run() {
		for (int i=0; i<20; i++) {
			System.out.println(name + ":" + i);
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
			}
		}
	}

}


class Brad782 implements Runnable {
	private String name;
	
	Brad782(String name){
		this.name = name;
	}

	@Override
	public void run() {
		for (int i=0; i<20; i++) {
			System.out.println(name + ":" + i);
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
			}
		}
	}
}


