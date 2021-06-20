package oop_EncapConcept;

public class A_EncapConcept {
	public String name;
	private int salary;
	private int age;
	public int Id;
    public int getsalary () {
    	
    	return salary;
    }
    public void setsalary(int salary) {
    	this.salary = salary;
    	
    }
	public int getage() {
		return age;
	}
	public void setage(int age) {
		this.age = age;
	}
	
	public static void main(String[] args) {
		A_EncapConcept obj = new A_EncapConcept();
		obj.name = "sowjanya";
		obj.salary = 60000;
		obj.age = 33;
		obj.Id = 1435;
		System.out.println(obj.name);
		System.out.println(obj.salary);

	}

}
