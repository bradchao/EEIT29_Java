package tw.org.iii.myclass;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JLabel;

public class MyClock extends JLabel {
	private Timer timer;
	
	public MyClock() {
		
		timer = new Timer();
		timer.schedule(new MyTask(), 0, 1000);
	}
	
	private class MyTask extends TimerTask {
		@Override
		public void run() {
			SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
			Calendar now = Calendar.getInstance();
			setText(sdf.format(now.getTime()));
			
		}
	}

}
