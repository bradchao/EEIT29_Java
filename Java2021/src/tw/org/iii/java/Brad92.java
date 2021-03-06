package tw.org.iii.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import javax.swing.JOptionPane;

import tw.org.iii.myclass.Member;

public class Brad92 {
	static Member member;
	static final String sqlLogin = "SELECT * FROM member WHERE account = ? AND passwd = ?";
	static PreparedStatement stmtLogin;
	
	public static void main(String[] args) {
		String account = JOptionPane.showInputDialog("Account");
		String passwd = JOptionPane.showInputDialog("Password");
		
		String url = "jdbc:mysql://localhost:3306/newiii";
		Properties prop = new Properties();
		prop.put("user", "root");
		prop.put("password", "root");
		
		try (Connection conn = DriverManager.getConnection(url, prop)) {
			stmtLogin = conn.prepareStatement(sqlLogin);
			
			if ( (member = login(account, passwd)) != null) {
				JOptionPane.showMessageDialog(null, String.format("Welcome! %s", member.getRealname()));
			}else {
				JOptionPane.showMessageDialog(null, "get out!");
			}
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}
	
	
	static Member login(String account, String passwd) throws SQLException {
		Member member = null;
		
		stmtLogin.setString(1, account);
		stmtLogin.setString(2, passwd);
		ResultSet rs = stmtLogin.executeQuery();
		if (rs.next()) {
			member = new Member(rs.getInt("id")
					,rs.getString("account")
					,rs.getString("passwd")
					,rs.getString("realname"));
		}
		
		return member;
	}

}
