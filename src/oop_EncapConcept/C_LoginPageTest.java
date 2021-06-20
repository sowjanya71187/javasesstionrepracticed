package oop_EncapConcept;

public class C_LoginPageTest {

	public static void main(String[] args) {
		C_LoginPage lp_customer = new C_LoginPage("sowji.gadiraju","valli@");
		//lp.setUserName("sowji.gadiraju");
		//lp.setPassword("valli@");
//		String n = lp.getUserName();
//		String p =lp.getPassword();
//		System.out.println(n);
//		System.out.println(p);
		lp_customer.doLogin(lp_customer.getUserName(), lp_customer.getPassword());
		lp_customer.logout();
		C_LoginPage lp_seller = new C_LoginPage("valli.gadiraju","valli@");
		lp_seller.doLogin(lp_seller.getUserName(), lp_seller.getPassword());
		lp_seller.logout();

	}

}