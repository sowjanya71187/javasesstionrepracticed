package oop_EncapConcept;

public class A_EncapTest {

	public static void main(String[] args) {
		A_EncapConcept obj = new A_EncapConcept();
		obj.name = "valli";
		obj.Id = 122;
		obj.setsalary(1000);
		obj.setage(33);
		int age = obj.getage();
		System.out.println(age);
		
		
			
		int sal=obj.getsalary();
		System.out.println(sal);

	}

}
