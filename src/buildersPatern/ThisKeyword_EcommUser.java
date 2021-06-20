package buildersPatern;

public class ThisKeyword_EcommUser {
	
	//this keyword is also used to return object of a class
	//we cane create with is chaining method
	//this is called builderpattern

	public static void main(String[] args) {
		This_EcommApp eApp = new This_EcommApp();
		eApp.login("sowji.gadiraju@gmail.com", "valli1987")
		.doserch("1+phone")
		.doserch("1+phone", 30000)
	    .selectProduct("1+new version")
	    .addToCart("1+phone")
	    .doPayment("sowji.gadiraju@gmail.com", "valli1987")
	    .logout()
	    .generateOrderid();
	    
            
	}

}
