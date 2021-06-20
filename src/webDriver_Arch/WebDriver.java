package webDriver_Arch;

public interface WebDriver extends SerchContext {
	
	public void get(String url);
	
	public String getTitle();
	
	public void click();
	
	public void sendkeys(String un , String pw);
	
	public void close();

}
