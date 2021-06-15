package tw.org.iii.java;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Racing extends JFrame {
	private JButton go;
	private JLabel[] lanes = new JLabel[8];
	
	public Racing() {
		super("Racing");
		
		setLayout(new GridLayout(9, 1));
		go = new JButton("Go!");
		add(go);
		
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
	private void go() {
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
				lanes[lane].setText(lanes[lane].getText() + ">");
				try {
					Thread.sleep(10 + (int)(Math.random()*100));
				} catch (InterruptedException e) {
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		new Racing();
	}

}
