package tw.org.iii.java;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Brad50 extends JFrame implements ActionListener {
	private JButton b1, b2, b3;
	
	public Brad50() {
		super("偶的視窗程式");
		
		b1 = new JButton("B1");
		b2 = new JButton("B2");
		b3 = new JButton("B3");
		
		setLayout(new FlowLayout());
		add(b1); add(b2); add(b3);
		
//		MyListener myListener = new MyListener();
//		b1.addActionListener(myListener);
//		b2.addActionListener(myListener);
		
//		b1.addActionListener(this);
//		b2.addActionListener(this);
//		b3.addActionListener(this);
		
		ButtonListener bListener = new ButtonListener();
		b1.addActionListener(bListener);
		b2.addActionListener(bListener);
		b3.addActionListener(bListener);
		
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent e) {
		//System.out.println("OK:" + e.getActionCommand());
		if (e.getSource() == b1) {
			System.out.println("b1");
		}else if (e.getSource() == b2) {
			System.out.println("b2");
		}else if (e.getSource() == b3) {
			System.out.println("b3");
		}
	}
	
	private class ButtonListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == b1) {
				System.out.println("b1");
			}else if (e.getSource() == b2) {
				System.out.println("b2");
			}else if (e.getSource() == b3) {
				System.out.println("b3");
			}
		}
	}
	
	public static void main(String[] args) {
		new Brad50();
	}

}

class MyListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		System.out.println("OK:" + e.getActionCommand());
//		if (e.getSource() == b1) {
//			
//		}
		
	}
}


