package javacode;

public class K_1_Customer {
	String name;
	String city;
	int custId;
	String orderId;
	boolean isActive;
	
	public K_1_Customer(String name,int custId){
		
		this.name = name;
		this.custId = custId;
	}
	

	public K_1_Customer(String name, String city, int custId, String orderId, boolean isActive) {
		
		this.name = name;
		this.city = city;	
		this.custId = custId;
		this.orderId = orderId;
		this.isActive = isActive;
	}


	public static void main(String[] args) {
		K_1_Customer c1 = new K_1_Customer("sowji", 1256) ;
		System.out.println(c1.name);
		System.out.println(c1.custId);
			
		

	}

}
