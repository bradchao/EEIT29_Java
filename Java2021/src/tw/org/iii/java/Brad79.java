package tw.org.iii.java;

import java.util.Timer;
import java.util.TimerTask;

public class Brad79 {

	public static void main(String[] args) {
		Timer timer = new Timer();
		
		MyTask mt1 = new MyTask();
		timer.schedule(mt1, 3*1000, 1000);
		
		EndTask endTask = new EndTask(timer);
		timer.schedule(endTask, 10*1000);
	}

}

class MyTask extends TimerTask {
	private int i;
	
	@Override
	public void run() {
		System.out.println(i++);
	}
}

class EndTask extends TimerTask {
	private Timer timer;
	EndTask(Timer timer){this.timer = timer;}
	
	@Override
	public void run() {
		timer.cancel();
		timer.purge();
		timer = null;
	}
}