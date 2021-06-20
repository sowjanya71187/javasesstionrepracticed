package accessModifires_pkg2;

import accessModifires.Employee;

public class HR extends Employee {
	/**
	 * Different package  SUB CLASSES  parent-chiled relation
	 * public == we can access
	 * protected == we can access
	 * 
	 * Default  == we  con't can access
	 * private == we con't access
	 * Same like sub class it act with in the PACKAGE
	 */

	public static void main(String[] args) {
		HR obj = new HR();
		obj.name = "sowjanya";//public
		obj.age = 33;//protected 
		
		obj.m1();//public method
		obj.m3();//protected method
		


	}

}
