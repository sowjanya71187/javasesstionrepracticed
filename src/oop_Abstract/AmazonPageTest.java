package oop_Abstract;

public class AmazonPageTest {

	public static void main(String[] args) {
		
		// hear we create both in parent and child constructors
		// both will called at run time 1st parent constructors will come 
		//2nd child constructors will come
		Loginpage lp = new Loginpage();
		lp.title();
		lp.logo();
		lp.title();
		lp.url();
		lp.loadingtimeOut();
		//top casting 
		//Child class object will refereed by parent ref variable
		page abstr=new Loginpage();
		
		abstr.heders();
		abstr.title();
		
		

	}

}
