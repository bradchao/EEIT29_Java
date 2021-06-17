package tw.org.iii.java;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;


public class Brad93 {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/newiii";
		Properties prop = new Properties();
		prop.put("user", "root");
		prop.put("password", "root");
		
		try (Connection conn = DriverManager.getConnection(url, prop)) {
			DatabaseMetaData metadata = conn.getMetaData();
			boolean isSupport = metadata.supportsResultSetConcurrency(
					ResultSet.TYPE_FORWARD_ONLY, 
					ResultSet.CONCUR_UPDATABLE);
			System.out.println(isSupport);
			
			String sql = "SELECT * FROM member";
			
			PreparedStatement pstmt = conn.prepareStatement(
					sql,
					ResultSet.TYPE_FORWARD_ONLY, 
					ResultSet.CONCUR_UPDATABLE);
			
			ResultSet rs = pstmt.executeQuery();
			
//			Statement stmt =  conn.createStatement(
//					ResultSet.TYPE_FORWARD_ONLY, 
//					ResultSet.CONCUR_UPDATABLE);
//			ResultSet rs = stmt.executeQuery(sql);
			
			//rs.next();
			
//			System.out.println(rs.getString("realname"));
			
//			rs.updateString("realname", "湯尼");
//			rs.updateRow();
			
//			rs.deleteRow();
			
			
//			rs.moveToInsertRow();
//			rs.updateString("account", "account");
//			rs.updateString("passwd", "passwd");
//			rs.updateString("realname", "realname");
//			rs.insertRow();
			
			//rs.beforeFirst();
			while ( rs.next()) {
				rs.deleteRow();
			}
			
			
			
			
		}catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
