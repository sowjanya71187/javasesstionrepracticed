package oop_EncapConcept;

public class C_LoginPage {
	private String userName;
	private String password;
	public C_LoginPage(String userName,String password){
		this.userName = userName;
		this.password = password;
		
		
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void doLogin(String un ,String pw) {
		System.out.println("user name is:"+un);
		System.out.println("password is:"+pw);
		System.out.println("click on login");
		System.out.println("login is done");
		
	}
	public void logout() {
		System.out.println("user is logout");
		
	}

}
