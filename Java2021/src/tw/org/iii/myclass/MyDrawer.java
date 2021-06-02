package tw.org.iii.myclass;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.DebugGraphics;
import javax.swing.JPanel;

public class MyDrawer extends JPanel {
	public MyDrawer() {
		setBackground(Color.YELLOW);
		
		MyMouseListener myMouseListener = new MyMouseListener();
		addMouseMotionListener(myMouseListener);
		
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		//System.out.println(g instanceof Graphics2D);
		//Graphics2D g2d = (Graphics2D)g;
		
		g.setColor(Color.BLUE);
		g.drawLine(0, 0, 200, 200);
	}
	
	private class MyMouseListener extends MouseAdapter {
		@Override
		public void mouseDragged(MouseEvent e) {
			super.mouseDragged(e);
			System.out.println(e.getX() + "," + e.getY());
		}
	}
	
}
