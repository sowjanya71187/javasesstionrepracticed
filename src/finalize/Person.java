package finalize;

public class Person {
	@Override
	public void finalize() {
		System.out.println("this is person class finalize method");
		//this method will be called before any clean up activity
		//garbage cellecter
	}

}
