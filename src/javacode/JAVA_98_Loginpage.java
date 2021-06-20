package javacode;

public class JAVA_98_Loginpage {
	/**
	 * method over loading
	 * compile time PolyMorpisam
	 * 
	 */
     public void login() {
    	 System.out.println("defoult login");
     }
     public void login(long phon) {
    	 System.out.println("login with phon no: "+phon);
    	 
     }
     public void login(long phon, int otp) {
    	 System.out.println("login with phon no: "+phon+"enter OTP: "+otp);
     }
     public void login(String un ,String pw) {
    	 System.out.println("enter username: "+un+"login with pw: "+pw );
     }
     
 
	public static void main(String[] args) {
		JAVA_98_Loginpage lgin = new JAVA_98_Loginpage();
		lgin.login();

	}

}
