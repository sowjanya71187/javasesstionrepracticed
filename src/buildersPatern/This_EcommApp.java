package buildersPatern;

public class This_EcommApp {
	
	public This_EcommApp login() {
		System.out.println("Defoult login");
		return this;
	}
    public This_EcommApp login(String un,String pw) {
    	System.out.println("login with user name & pw:"+un+ ": " +pw);
    	return this;
	} 
    public This_EcommApp doserch(String productname) {
    	System.out.print("serch with: "+productname);
    	return this;
    }
    
    public This_EcommApp doserch(String productname,int price) {
    	System.out.print("serch with: "+productname + "price: "+price);
    	return this;
     }
    
    public This_EcommApp selectProduct(String productname) {
    	System.out.println("select the product name "+ productname);
    	return this;
    	
    }
    public This_EcommApp addToCart(String productname) {
    	
    	System.out.println("adding the product in to cart "+ productname);
    	return this;
    }
    public This_EcommApp doPayment(String accountname , String pwd) {
    	System.out.println("pament done via : " +accountname + " : "+pwd);
    	return this;
    }
    public int generateOrderid() {
    	return 10056;
    }
    public This_EcommApp getEmail() {
    		System.out.println("email is sent sucessfully");
    		return this;
    }
    public This_EcommApp logout() {
    	System.out.println("logout from app");
    	return this;
    }
    

}
