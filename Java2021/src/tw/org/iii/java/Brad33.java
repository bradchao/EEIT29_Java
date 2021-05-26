package tw.org.iii.java;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Brad33 extends JFrame {
	private JButton bt1, bt2, bt3;
	
	public Brad33() {
		bt1 = new JButton("BT1");
		bt2 = new JButton("BT2");
		bt3 = new JButton("BT3");
		
		setLayout(new FlowLayout());
		
		add(bt1); add(bt2); add(bt3);
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// Exception in thread "main" java.lang.NullPointerException: 
		// Cannot read field "parent" because "comp" is null
	}

	public static void main(String[] args) {
		new Brad33();
	}

}
