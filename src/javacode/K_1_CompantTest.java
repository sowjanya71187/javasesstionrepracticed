package javacode;

public class K_1_CompantTest {

	public static void main(String[] args) {
		K_1_Company obj = new K_1_Company("sowji", 1254, "ishu"); 
		System.out.println(obj.name+" "+obj.empCount+" "+obj.ceoName);
       String name=obj.getCompName();	
       System.out.println(name);
	}

}
