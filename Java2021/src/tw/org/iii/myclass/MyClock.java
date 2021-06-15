package tw.org.iii.myclass;

import java.util.Calendar;

import javax.swing.JLabel;

public class MyClock extends JLabel {
	public MyClock() {
		Calendar now = Calendar.getInstance();
		int hh = now.get(Calendar.HOUR_OF_DAY);
		int mm = now.get(Calendar.MINUTE);
		setText(hh + ":" + mm);
	}

}
