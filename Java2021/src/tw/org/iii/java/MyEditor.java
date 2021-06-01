package tw.org.iii.java;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class MyEditor extends JFrame {
	private JButton openBtn, newBtn, saveBtn, saveAsBtn;
	private JTextArea jTextArea;
	
	public MyEditor() {
		super("Brad 文字編輯器");
		
		setLayout(new BorderLayout());
		
		JPanel topLine = new JPanel(new FlowLayout());
		openBtn = new JButton("Open");
		newBtn = new JButton("New");
		saveBtn = new JButton("Save");
		saveAsBtn = new JButton("Save as");
		topLine.add(newBtn);topLine.add(openBtn);
		topLine.add(saveBtn);topLine.add(saveAsBtn);
		
		add(topLine, BorderLayout.NORTH);
		
		jTextArea = new JTextArea();
		add(jTextArea, BorderLayout.CENTER);
		
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new MyEditor();
	}

}
