package javacode;

public class JAVA_98_Browser {
	
	public void lounchBrowesr(String browserName) {
		System.out.println("browser name is: "+browserName);
		if(browserName.equalsIgnoreCase("chrome")) {
			System.out.println("lounch the chrome browser");
		}else if(browserName.equalsIgnoreCase("firefox")){
			
			System.out.println("lounch the firefox browser");
		}
	}

	public static void main(String[] args) {
		JAVA_98_Browser br = new JAVA_98_Browser();
		br.lounchBrowesr("firefox");

	}

}
