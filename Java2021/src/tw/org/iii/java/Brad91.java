package tw.org.iii.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

import javax.swing.JOptionPane;

public class Brad91 {
	static final String sqlAppend = "INSERT INTO member (account,passwd,realname) VALUES (?,?,?)";
	static PreparedStatement stmtAppend;
	
	public static void main(String[] args) {
		String account = JOptionPane.showInputDialog("Account");
		String passwd = JOptionPane.showInputDialog("Password");
		
		String url = "jdbc:mysql://localhost:3306/newiii";
		Properties prop = new Properties();
		prop.put("user", "root");
		prop.put("password", "root");
		
		try (Connection conn = DriverManager.getConnection(url, prop)) {
			stmtAppend = conn.prepareStatement(sqlAppend);
			if (!isDataRepeat(account)) {
				
			}else {
				JOptionPane.showMessageDialog(null, "資料重複錯誤");
			}
			
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		
	}
	
	static boolean isDataRepeat(String account) {
		return true;
	}

}
