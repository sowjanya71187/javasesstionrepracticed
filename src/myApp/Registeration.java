package myApp;
/**
 * when we have multiple parameters
 * @author admin
 * pojo class == plain old java object
 * pojo class should not extend any thing
 * no main method
 * itshould not have any annotTION ALSO
 */
public class Registeration {
	
	private String firstname;
	private String lastname;
	private String emID;
	private String phonno;
	private String address;
	public Registeration(String firstname, String lastname, String emID, String phonno, String address) {
		
		this.firstname = firstname;
		this.lastname = lastname;
		this.emID = emID;
		this.phonno = phonno;
		this.address = address;
	}
	public void registorUser(Registeration rUser) {
		System.out.println(rUser.firstname+" : "+rUser.lastname+" : "+rUser.emID+" : "+
				rUser.address+" : "+rUser.phonno);
		
	}
    

	

}
