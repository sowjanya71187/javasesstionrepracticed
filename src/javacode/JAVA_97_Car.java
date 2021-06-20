package javacode;

public class JAVA_97_Car {
	String name;
	String model;
	String colur;
	int price;
	boolean isAvilable;
	boolean isAutomatic;

	public static void main(String[] args) {
		JAVA_97_Car c1 = new JAVA_97_Car();
		c1.name = "BMW";
		c1.model="BMW520";
		c1.price = 75;
		c1.isAvilable=true;
		c1.isAutomatic= true;
		System.out.println(c1.name+" "+c1.model+" "+c1.price+" "+c1.colur);
        System.out.println(c1.isAvilable);
	}

}
