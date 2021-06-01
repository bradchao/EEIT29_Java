package tw.org.iii.java;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class MyEditor extends JFrame {
	private JButton openBtn, newBtn, saveBtn, saveAsBtn;
	private JTextArea jTextArea;
	private File file; 
	
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
		// file = null;
	}
	
	private void openFile() {
		JFileChooser jfc = new JFileChooser();
		int result = jfc.showOpenDialog(this); 
		if (result == JFileChooser.APPROVE_OPTION) {
			file = jfc.getSelectedFile();
			readFile();
		}
	}
	
	private void readFile() {
		char[] buf = new char[(int)file.length()];
		try {
			FileReader reader = new FileReader(file);
			int len = reader.read(buf);
			reader.close();	// 請問一下 reader.close() 之後為什麼content還是能取到值?
			
			String content = new String(buf,0,len);
			jTextArea.setText(content);
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}
	
	private void saveFile() {
		if (file == null) {
			saveAsFile();
		}else {
			try {
				FileWriter out = new FileWriter(file);
				out.write(jTextArea.getText());
				out.flush();
				out.close();
				JOptionPane.showMessageDialog(this, "Save OK");
			}catch(Exception e) {
				System.out.println(e.toString());
			}
			
		}
	}
	
	private void saveAsFile() {
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
		JScrollPane jsp = new JScrollPane(jTextArea);
		add(jsp, BorderLayout.CENTER);
	}
	
	

	public static void main(String[] args) {
		new MyEditor();
	}

}
