package tw.org.iii.myclass;

public class Member {
	private int id;
	private String account, passwd, realname;

	public Member(int id, String account, String passwd, String realname) {
		this.id = id;
		this.account = account;
		this.passwd = passwd;
		this.realname = realname;
	}
	
	public int getId() {
		return id;
	}
	public String getAccount() {
		return account;
	}
	public String getPasswd() {
		return passwd;
	}
	public String getRealname() {
		return realname;
	}
	
	
}
