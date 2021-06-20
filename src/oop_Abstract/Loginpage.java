package oop_Abstract;

public class Loginpage extends page {
	
	public Loginpage() {
		System.out.println("Login page constructer");
	}

	@Override
	public void title() {
		System.out.println("my login title");
		
	}

	@Override
	public void heders() {
		System.out.println("login page header");
		
	}

	@Override
	public void url() {
		System.out.println("https://www.xyz.com");
		
	}
	public void loadingtimeOut() {
		System.out.println("sesstion expaired with in 10sec");
	}

}
