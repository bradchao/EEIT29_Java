package tw.org.iii.java;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Timer;
import java.util.TimerTask;

import javax.imageio.ImageIO;
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
		private BufferedImage ballImg = null;
		private Timer timer;
		private int x, y, viewW, viewH, dx, dy, ballW, ballH;
		
		public MyPanel() {
			dx = dy = 8;
			
			timer = new Timer();
			try {
				ballImg = ImageIO.read(new File("dir1/ball3.png"));
				ballW = ballImg.getWidth();
				ballH = ballImg.getHeight();
			}catch(Exception e) {
				
			}
			timer.schedule(new MyTask(), 1000, 60);
		}
		
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);

			viewW = getWidth();
			viewH = getHeight();

			
			if (ballImg == null) return;
			
			g.drawImage(ballImg, x, y,  null);
			
		}
		
		private class MyTask extends TimerTask {
			@Override
			public void run() {
				if (x < 0 || x  + ballW > viewW) {
					dx *= -1;
				}
				if (y<0 || y + ballH > viewH ) {
					dy *= -1;
				}
				
				x += dx; y += dy;
				repaint();
			}
		}
		
	}

	public static void main(String[] args) {
		new Brad80();
	}

}
