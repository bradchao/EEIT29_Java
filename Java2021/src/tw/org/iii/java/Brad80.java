package tw.org.iii.java;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.LinkedList;
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
		private int viewW, viewH, ballW, ballH;
		private LinkedList<Ball> balls = new LinkedList<>();
		
		public MyPanel() {
			
			try {
				ballImg = ImageIO.read(new File("dir1/ball3.png"));
				ballW = ballImg.getWidth();
				ballH = ballImg.getHeight();
			}catch(Exception e) {
				
			}
			timer = new Timer();
			timer.schedule(new RefreshView(), 0, 16);
			// 60fps => 1000 / 60
			
			addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					createNewBall(e.getX(), e.getY());
				}
			});
		}
		
		private void createNewBall(int x, int y) {
			Ball ball = new Ball(x, y);
			balls.add(ball);
			timer.schedule(ball, 1000, 30);
		}
		
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);

			viewW = getWidth();
			viewH = getHeight();

			
			if (ballImg == null) return;
			
			for(Ball ball : balls) {
				g.drawImage(ballImg, ball.getX(), ball.getY(),  null);
			}
			
		}
		
		private class RefreshView extends TimerTask {
			@Override
			public void run() {
				repaint();
			}
		}
		
		private class Ball extends TimerTask {
			private int x, y, dx, dy;
			
			Ball(int x, int y){
				this.x = x; this.y = y;
				dx = dy = 8;
			}
			
			@Override
			public void run() {
				if (x < 0 || x  + ballW > viewW) {
					dx *= -1;
				}
				if (y<0 || y + ballH > viewH ) {
					dy *= -1;
				}
				
				x += dx; y += dy;
			}
			
			int getX() {return x;}
			int getY() {return y;}
		}
		
	}

	public static void main(String[] args) {
		new Brad80();
	}

}
