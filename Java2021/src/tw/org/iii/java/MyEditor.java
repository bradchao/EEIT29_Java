package tw.org.iii.java;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class MyEditor extends JFrame {
	private JButton openBtn, newBtn, saveBtn, saveAsBtn;
	private JTextArea jTextArea;
	
	public MyEditor() {
		super("Brad 文字編輯器");
		
		initView();
		initEvent();
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private void initEvent() {
		newBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				clearTextArea();
			}
		});
		openBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				openFile();
			}
		});
		saveBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				saveFile();
			}
		});
		saveAsBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				saveAsFile();
			}
		});
		
	}
	
	
	private void clearTextArea() {
		jTextArea.setText("");
	}
	
	private void openFile() {
		JFileChooser jfc = new JFileChooser();
		int result = jfc.showOpenDialog(this); 
		if (result == JFileChooser.APPROVE_OPTION) {
			File file = jfc.getSelectedFile();
		}
	}
	
	private void saveFile() {
		System.out.println("C");
	}
	
	private void saveAsFile() {
		System.out.println("D");
	}
	
	
	private void initView() {
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
	}
	
	

	public static void main(String[] args) {
		new MyEditor();
	}

}
