package tw.org.iii.java;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MySign extends JFrame {
	private JButton clear; 
	
	public MySign() {
		super("簽名app");
		
		initView();
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private void initView() {
		setLayout(new BorderLayout());
		
		JPanel topLine = new JPanel(new FlowLayout());
		clear = new JButton("Clear");
		topLine.add(clear);
		
		add(topLine, BorderLayout.NORTH);
		
	}

	public static void main(String[] args) {
		new MySign();
	}

}
