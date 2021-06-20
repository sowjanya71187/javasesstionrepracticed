package oop_Abstract;

public abstract class page {
	
	// we cont create obj of abstract class
	//but abstract class constructed can be created
	// but it will called when you create the obj of chiled class
	//abstract class - 0 to 100% abstraction
	//1.abstract methods + non abstract methods = partioal abstraction
	//2.only non abstaction = 0% abstaction
	//3.only abstract class = 100% abstraction
	//static is never patispate in object it is always in CMA
	
	
	public page() {
		System.out.println("page class constructer");
	}
	
	public abstract void title();
	
	public abstract void heders();
	
	public abstract void url();
	
	
	
	public final void logo() {
		System.out.println("app logo");
	}
	
	public void loadingtimeOut() {
		System.out.println("sesstion expaired with in 20sec");
	}

}
