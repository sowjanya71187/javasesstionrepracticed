package oop_Inheritance;

public class A_3Test {

	public static void main(String[] args) {
		A_2Bmw test = new A_2Bmw();
		test.start();
		test.stop();
		test.refuel();
		test.autoParking();
		test.engine();
		//chiled class obj will ref by parent  class ref variable
		//Top casting
		A_1car pr = new A_2Bmw();
		pr.start();
		pr.engine();
		
		//chiled class obj will ref by parent  class ref variable
		//down casting// compile time it is allowed but run time it gives class cost exception
		//A_2Bmw pr1 = (A_2Bmw)new A_1car();
		//pr1.start();
		
		Vechile v1 = new A_2Bmw();
		v1.engine();
		
		
		

	}

}

