package webDriver_Arch;

public class ChromeDriver implements WebDriver {
	public ChromeDriver() {
		System.out.println("lounch chrome browser");
		System.out.println("chrome is lounched");
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
		System.out.println("chrome is closed");
		
	}

}
