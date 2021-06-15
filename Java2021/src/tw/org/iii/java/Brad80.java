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
		private BufferedImage[] ballImgs = new BufferedImage[4];
		private Timer timer;
		private int viewW, viewH, ballW, ballH;
		private LinkedList<Ball> balls = new LinkedList<>();
		
		public MyPanel() {
			
			try {
				ballImgs[0] = ImageIO.read(new File("dir1/ball0.png"));
				ballImgs[1] = ImageIO.read(new File("dir1/ball1.png"));
				ballImgs[2] = ImageIO.read(new File("dir1/ball2.png"));
				ballImgs[3] = ImageIO.read(new File("dir1/ball3.png"));
				ballW = ballImgs[0].getWidth();
				ballH = ballImgs[0].getHeight();
			}catch(Exception e) {
				
			}
			timer = new Timer();
			timer.schedule(new RefreshView(), 0, 16);
			// 60fps => 1000 / 60
			
			addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					createNewBall(e.getX() - ballW/2, e.getY() - ballH/2);
				}
			});
		}
		
		private void createNewBall(int x, int y) {
			Ball ball = new Ball(x, y, (int)(Math.random()*4));
			balls.add(ball);
			timer.schedule(ball, 0, 30);
		}
		
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);

			viewW = getWidth();
			viewH = getHeight();

			for(Ball ball : balls) {
				if (ballImgs[ball.getImg()] == null) continue;
				g.drawImage(ballImgs[ball.getImg()], ball.getX(), ball.getY(),  null);
			}
			
		}
		
		private class RefreshView extends TimerTask {
			@Override
			public void run() {
				repaint();
			}
		}
		
		private class Ball extends TimerTask {
			private int x, y, dx, dy, img;
			
			Ball(int x, int y, int img){
				this.x = x; this.y = y; this.img = img;
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
			int getImg() {return img;}
		}
		
	}

	public static void main(String[] args) {
		new Brad80();
	}

}
