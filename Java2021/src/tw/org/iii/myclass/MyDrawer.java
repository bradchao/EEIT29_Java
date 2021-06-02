package tw.org.iii.myclass;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashMap;
import java.util.LinkedList;

import javax.swing.DebugGraphics;
import javax.swing.JPanel;

public class MyDrawer extends JPanel {
	private LinkedList<HashMap<String, Integer>> line = new LinkedList<>();
	
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
		for (int i=1; i<line.size(); i++) {
			HashMap<String, Integer> p0 = line.get(i-1);
			HashMap<String, Integer> p1 = line.get(i);
			System.out.println("" + p0.get("x") + "," +p0.get("y") + "," + p1.get("x") + "," + p1.get("y"));
			g.drawLine(p0.get("x"), p0.get("y"), p1.get("x"), p1.get("y"));
		}
	}
	
	private class MyMouseListener extends MouseAdapter {
		@Override
		public void mouseDragged(MouseEvent e) {
			super.mouseDragged(e);
			//System.out.println(e.getX() + "," + e.getY());
			
			HashMap<String, Integer> point = new HashMap<>();
			point.put("x", e.getX()); point.put("y", e.getY());
			
			line.add(point);
			invalidate();
		}
	}
	
}
