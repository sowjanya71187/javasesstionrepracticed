package superKeyword;

public class BMW extends Car{
	String name;
	int price;

	/**we calling PARENT class constructor with help of child
	 * class constructor using super keyword this is calling
	 * constructor chaining
	 * super keyword always in 1st statement
	 */  
	public BMW() {
		
		super();
		System.out.println("Bmw constructer.....");
	}

	public BMW(String name, int price) {
		
		super(name, price);
		this.name = name;
    	this.price = price;
	}
}
