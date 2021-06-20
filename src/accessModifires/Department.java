package accessModifires;

/**
 * with in the package non SUB CLASSES  No parent-chiled relation
 * public == we can access
 * protected == we can access
 * Default  == we can access
 * private == we con't access
 * Same like sub class it act with in the PACKAGE
 */

public class Department {

	public static void main(String[] args) {
		Employee obj = new Employee();
		obj.name = "sowjanya";//public
		obj.age = 33;//protected 
		obj.empID = "143";//Default
		obj.m1();//public method
		obj.m3();//protected method
		obj.m4();// Default

	}

}
