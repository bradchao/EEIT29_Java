package tw.org.iii.myclass;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.LinkedList;

import javax.swing.DebugGraphics;
import javax.swing.JPanel;

public class MyDrawer extends JPanel {
	private LinkedList<LinkedList<HashMap<String, Integer>>> lines = new LinkedList<>();
	private LinkedList<LinkedList<HashMap<String, Integer>>> recycler = new LinkedList<>();
	
	public MyDrawer() {
		// super();
		setBackground(Color.YELLOW);
		
		MyMouseListener myMouseListener = new MyMouseListener();
		addMouseMotionListener(myMouseListener);
		addMouseListener(myMouseListener);
		
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		//System.out.println(g instanceof Graphics2D);
		//Graphics2D g2d = (Graphics2D)g;
		
		g.setColor(Color.BLUE);
		for (LinkedList<HashMap<String, Integer>> line : lines) {
			for (int i=1; i<line.size(); i++) {
				HashMap<String, Integer> p0 = line.get(i-1);
				HashMap<String, Integer> p1 = line.get(i);
				g.drawLine(p0.get("x"), p0.get("y"), p1.get("x"), p1.get("y"));
			}			
		}
	}
	
	private class MyMouseListener extends MouseAdapter {
		@Override
		public void mouseDragged(MouseEvent e) {
			super.mouseDragged(e);

			HashMap<String, Integer> point = new HashMap<>();
			point.put("x", e.getX()); point.put("y", e.getY());
			
			lines.getLast().add(point);
			repaint();
		}

		@Override
		public void mousePressed(MouseEvent e) {
			super.mousePressed(e);
			
			recycler.clear();
			
			LinkedList<HashMap<String, Integer>> line = new LinkedList<>();
			HashMap<String, Integer> point = new HashMap<>();
			point.put("x", e.getX()); point.put("y", e.getY());
			line.add(point);
			
			lines.add(line);
			repaint();
		}
		
		
		
		
	}
	
	public void clear() {
		lines.clear();
		repaint();
	}
	
	public void undo() {
		if (lines.size()>0) {
			recycler.add(lines.removeLast()) ;
			repaint();
		}
	}
	
	public void redo() {
		if (recycler.size() > 0) {
			lines.add(recycler.removeLast());
			repaint();
		}
	}

	public void saveObject() throws IOException {
		ObjectOutputStream oout = 
			new ObjectOutputStream(new FileOutputStream("dir1/mysign.brad"));
		oout.writeObject(lines);
		oout.flush();
		oout.close();
	}
	
	public void loadObject() throws Exception {
		ObjectInputStream oin = 
			new ObjectInputStream(new FileInputStream("dir1/mysign.brad"));
		Object obj = oin.readObject();
		if (obj instanceof LinkedList) {
			lines = (LinkedList<LinkedList<HashMap<String, Integer>>>)obj;
			recycler.clear();
			repaint();
		}else {
			throw new Exception("............");
		}
		
		
		
	}
	
	

}
