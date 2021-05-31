package tw.org.iii.java;

import javax.swing.JFrame;

public class Brad50 extends JFrame{
	
	public Brad50() {
		super("偶的視窗程式");
		
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Brad50();
	}

}
