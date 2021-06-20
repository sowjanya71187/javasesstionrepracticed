package superKeyword;

public class Test {

	public static void main(String[] args) {
		
		BMW obj = new BMW();
		
		
		BMW obj1 = new BMW("BMW520D",900000);
		System.out.println(obj1.name+ " : "+ obj1.price);
		 Car c = new Car();
		 c.setName("sowjanya");
		 c.setPrice(400000);
		 
		 System.out.println(c.name+ " : "+ c.price);

	}

}
