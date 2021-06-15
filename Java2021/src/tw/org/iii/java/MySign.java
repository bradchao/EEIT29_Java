package tw.org.iii.java;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import tw.org.iii.myclass.MyClock;
import tw.org.iii.myclass.MyDrawer;

public class MySign extends JFrame {
	private JButton clear, undo, redo, save, saveObj, loadObj; 
	private MyDrawer myDrawer;
	private MyClock myClock;
	
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

		undo = new JButton("Undo");
		topLine.add(undo);

		redo = new JButton("Redo");
		topLine.add(redo);
		
		save = new JButton("Save");
		topLine.add(save);

		saveObj = new JButton("Save Object");
		topLine.add(saveObj);

		loadObj = new JButton("Load Object");
		topLine.add(loadObj);
		
		myClock = new MyClock();
		topLine.add(myClock);

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
		
		undo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				myDrawer.undo();
			}
		});
		
		redo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				myDrawer.redo();
			}
		});
		
		save.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				BufferedImage image = new BufferedImage(myDrawer.getWidth(), myDrawer.getHeight(), 
						BufferedImage.TYPE_INT_RGB);
				Graphics2D g2d = image.createGraphics();
				myDrawer.paint(g2d);
				try {
					ImageIO.write(image, "jpeg", new File("dir1/brad.jpg"));
					JOptionPane.showMessageDialog(null, "Save JPEG OK");
				}catch(Exception e2) {
					System.out.println(e2.toString());
				}
			}
		});
		
		saveObj.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					myDrawer.saveObject();
					JOptionPane.showMessageDialog(null, "Save Object Success");
				}catch (Exception ee) {
					JOptionPane.showMessageDialog(null, "Save Object Failure");
				}
			}
		});
		
		loadObj.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					myDrawer.loadObject();
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, e1.toString());
				}
			}
		});
	}

	public static void main(String[] args) {
		new MySign();
	}

}
