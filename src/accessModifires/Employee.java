package accessModifires;

public class Employee {
	/**
	 * with in the class we can access every thing
	 * public == we can access
	 * protected == we can access
	 * Default  == we can access
	 * private == we can access
	 */
	
	public String name;
	protected int age;
	String empID;
	private double salary; 
	
	public void m1() {
		System.out.println("m1 public method");
	}
	private void m2() {
		System.out.println("m2 private method");
	}
	protected void m3() {
		System.out.println("m3 protected method");
	}
    
	void m4() {
		System.out.println("m4 defoult method");
	}
	public static void main(String[] args) {
		Employee e = new Employee();
		e.name = "ramu";
		e.age = 45;
		e.empID = "ishtau";
		e.salary = 60000;
		e.m1();
		e.m2();
		e.m3();
		e.m4();

	}

}
