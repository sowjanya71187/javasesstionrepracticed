package javacode;

public class JAVA_99_CarDesign {
	String name;
	int price;
	String colour;
	static final int wheels =4;//it become constant because of final keyword
	public static void main(String[] args) {
		
		 JAVA_99_CarDesign obj1 = new  JAVA_99_CarDesign ();
		 obj1.name = "BMW";
		 obj1.price = 30;
		 obj1.colour = "red";
		 System.out.println(wheels);
		 
		 JAVA_99_CarDesign obj2 = new  JAVA_99_CarDesign ();
		 obj2.name = "Audi";
		 obj2.price = 70;
		 obj2.colour = "Block";
		 System.out.println(obj1.name+""+wheels);



	}

}
