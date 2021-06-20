package superKeyword;

public class HR extends Department{
	
	int dept_code = 102;
	
	public void getDeptId() {
		System.out.println("dep id--------HR");
	}
	public void getDeptInfo() {
		getDeptId();
		super.getDeptId();
	}
	
	

}
