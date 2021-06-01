package tw.org.iii.java;

import javax.swing.JFrame;

public class MyEditor extends JFrame {
	
	public MyEditor() {
		super("Brad 文字編輯器");
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new MyEditor();
	}

}
