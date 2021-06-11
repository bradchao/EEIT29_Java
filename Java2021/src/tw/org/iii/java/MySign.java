package tw.org.iii.java;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import tw.org.iii.myclass.MyDrawer;

public class MySign extends JFrame {
	private JButton clear; 
	private MyDrawer myDrawer;
	
	public MySign() {
		super("簽名app");
		
		initView();
		initEvent();
		
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
		
		myDrawer = new MyDrawer();
		add(myDrawer, BorderLayout.CENTER);
		
	}
	
	private void initEvent() {
		clear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				myDrawer.clear();
			}
		});
	}

	public static void main(String[] args) {
		new MySign();
	}

}
