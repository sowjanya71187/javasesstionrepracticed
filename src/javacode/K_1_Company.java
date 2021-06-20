package javacode;

public class K_1_Company {
	String name;
	int empCount;
	String logo;
	String HQ;
	String ceoName;
	public K_1_Company(String name, int empCount, String logo, String hQ, String ceoName) {
		
		this.name = name;
		this.empCount = empCount;
		this.logo = logo;
		HQ = hQ;
		this.ceoName = ceoName;
	}
	public K_1_Company(String name, int empCount, String ceoName) {
		
		this.name = name;
		this.empCount = empCount;
		this.ceoName = ceoName;
	}
	public String getCompName() {
		return name;
	}
	
	

}
