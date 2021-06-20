package javacode;

public class K_1_Student {
/**
 * normally method will called by obj referance
 * if it static then it call by class name
 * constucter will called when we create obj imediatly it called
 * diff btwn const and class class keyword
 * method overLoading is passible
 */
	
	String name;
	int rollNumber;
	String standard;
	boolean isActive;
	String city;
	public K_1_Student() {
		//Default cons means no parameters
		System.out.println("defoult condt....");
	}
	public K_1_Student(int a) {
		//Default cost means no parameters
		System.out.println("one para...."+a);
	}
	//method vis constructor
	// method may r may not return value but constructor will never 
	//return no return type
	//method can have any name but constructor will 
	//have only one name which is same as class name
	

	public static void main(String[] args) {
	
		K_1_Student obj = new K_1_Student();
		K_1_Student obj1 = new K_1_Student(10);
	}

}
