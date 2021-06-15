package tw.org.iii.java;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Brad80 extends JFrame {
	private MyPanel myPanel;
	
	public Brad80() {
		setLayout(new BorderLayout());
		
		myPanel = new MyPanel();
		add(myPanel, BorderLayout.CENTER);
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private class MyPanel extends JPanel {
		
	}

	public static void main(String[] args) {
		new Brad80();
	}

}
