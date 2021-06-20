package webDriver_Arch;

public class SwitchcaseBrowser {
	static WebDriver driver;
	public static void main(String[] args) {
		String Browser = "ff";
		switch (Browser) {
		case "chrome": 
			driver = new ChromeDriver();
			
			break;
		case "ff": 
			driver = new FirefoxDriver();
			
			break;
			
			

		default:
			break;
		}
	}

}
