package accessModifires_pkg2;

import accessModifires.Employee;

public class Admin {
	/**
	 * Different package NON  SUB CLASSES NO parent-chiled relation
	 * public == we can access
	 * protected == we  con't can access
	 * 
	 * Default  == we  con't can access
	 * private == we con't access
	 * Same like sub class it act with in the PACKAGE
	 */

	public static void main(String[] args) {
		Employee obj = new Employee();
		obj.name = "ishaan";
		obj.m1();

	}

}
