package webDriver_Arch;

public class GoogleTest {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		String title =driver.getTitle();
		System.out.println(title);
		if(title.equalsIgnoreCase("google")) {
			System.out.println("title is currect");
		}else {
			System.out.println("title is incurrect");
		}
			
		driver.sendkeys("sowji.gadiraju@gmil.com", "valli@1987");
		driver.click();
		driver.findElement("by locater");
		driver.close();
		

	}

}
