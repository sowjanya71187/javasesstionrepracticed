package accessModifires;

public class Manager extends Employee {

	public static void main(String[] args) {
		/**
		 * with in the package SUB CLASSES parent-chiled
		 * public == we can access
		 * protected == we can access
		 * Default  == we can access
		 * private == we con't access
		 */
		Manager obj = new Manager();
		obj.name = "sowjanya";//public
		obj.age = 33;//protected 
		obj.empID = "143";//Default 
		obj.m1();//public method
		obj.m3();//protected method
		obj.m4();//Default

	}

}
