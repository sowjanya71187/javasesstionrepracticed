package oop_Inheritance;

public class A_2Bmw  extends A_1car{
	//runtime polymarpisam - method ovrriding
	//compile time polymarpisam - method overloading
	//same method names same return types same parameters
	//the signature must be same
	// we cant oveerriden static method
	//we can overload static method 
	public void start() {
		System.out.println("Bmwcar start..........");
	}
	public void autoParking() {
		System.out.println("this car has autoparking..........");
	}

}
