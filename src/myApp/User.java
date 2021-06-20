package myApp;

public class User {

	public static void main(String[] args) {
		Application obj = new Application("admin", "admin");
		obj.doLogin();
		Application obj1 = new Application();
		obj1.setUsername("ramakrishna");
		obj1.setPassword("ramu");
		obj1.doLogin();
			
	
		
		

	}

}
