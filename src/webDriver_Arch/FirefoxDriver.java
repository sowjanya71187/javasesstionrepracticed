package webDriver_Arch;

public class FirefoxDriver implements WebDriver {
	
	public FirefoxDriver() {
		System.out.println("lounch the firefox");
		System.out.println("firefox is lounched");
	}

	@Override
	public void findElement(String locater) {
		System.out.println("find the element with: "+locater);
		
	}

	@Override
	public void get(String url) {
		System.out.println("enter the url: "+url);
		
	}

	@Override
	public String getTitle() {
		System.out.println("got the title ");
		return "google";
	}

	@Override
	public void click() {
		System.out.println("click on element");
		
	}

	@Override
	public void sendkeys(String un , String pw) {
		System.out.println("user name is: "+un+" " +" password is: "+pw);
		
	}

	@Override
	public void close() {
		System.out.println("browser is closed");
		
	}
}
