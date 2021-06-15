package tw.org.iii.java;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import tw.org.iii.myclass.MyClock;

public class Racing extends JFrame {
	private JButton go;
	private JLabel[] lanes = new JLabel[8];
	
	public Racing() {
		super("Racing");
		
		setLayout(new GridLayout(9, 1));
		JPanel top = new JPanel(new BorderLayout());
		go = new JButton("Go!");
		top.add(go, BorderLayout.CENTER);
		MyClock myClock = new MyClock();
		top.add(myClock, BorderLayout.EAST); 
		
		add(top);
		
		for (int i=0; i<lanes.length; i++) {
			lanes[i] = new JLabel((i+1) + ". ");
			add(lanes[i]);
		}
		
		go.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				go();
			}
		});
		
		setSize(1280, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	private Car[] cars = new Car[8];
	private int rank;
	
	private void go() {
		rank = 0;
		for (int i=0; i<cars.length; i++ ) {
			lanes[i].setText((i+1) + ". ");
			cars[i] = new Car(i);
			cars[i].start();
		}
	}

	private class Car extends Thread {
		private int lane;
		Car(int lane){ this.lane = lane;}
		@Override
		public void run() {
			for (int i=0; i<100; i++) {
				if (i == 99) {
					lanes[lane].setText(lanes[lane].getText() + ">" + ++rank);
					stopRound();
				}else {
					lanes[lane].setText(lanes[lane].getText() + ">");
				}
				
				try {
					Thread.sleep(10 + (int)(Math.random()*100));
				} catch (InterruptedException e) {
					break;
				}
			}
		}
	}
	
	private void stopRound() {
		for (int i=0; i<cars.length; i++) {
			cars[i].interrupt();
		}
	}
	
	public static void main(String[] args) {
		new Racing();
	}

}
