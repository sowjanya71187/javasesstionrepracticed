package javacode;

public class JAVA_97_Employee {
    String name;
    int age;
    int empID;
    double salary;
    //class variables it create photo copy given to object
	public static void main(String[] args) {
		//object of the class:new keyword
		JAVA_97_Employee e = new JAVA_97_Employee();
		//heap ,stack memory
		//objects always store in heap memory
		//Reference should be store in stack memory
		//JAVA_97_Employee e1 = new JAVA_97_Employee();
		e.name="sowjanya";
		e.age = 33;
		e.empID=1987;
		e.salary=50000;
		System.out.println(e.name+" "+e.age+" "+e.salary);
		JAVA_97_Employee e1 = new JAVA_97_Employee();
		e1.name="ramakrishna";
		//e1.age = 38;
		e1.empID=1987;
		e1.salary=100000;
		System.out.println(e1.name+" "+e1.age+" "+e1.salary);
        
	}

}
