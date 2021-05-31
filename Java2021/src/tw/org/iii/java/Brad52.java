package tw.org.iii.java;



import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

public class Brad52 extends JFrame {

	public Brad52() {

		MyMouseAdapter adapter = new MyMouseAdapter();
		addMouseListener(adapter);
		addMouseMotionListener(adapter);
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private class MyMouseAdapter extends MouseAdapter {

		@Override
		public void mouseClicked(MouseEvent e) {
			System.out.println("Click");
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			System.out.println("Move:" + e.getX() + ", " + e.getY());
		}
		
	}
	
	
	public static void main(String[] args) {
		new Brad52();
	}

}
