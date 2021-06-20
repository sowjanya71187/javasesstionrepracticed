package oop_Interface;

public class TestHospital {
	//cannot create obj of interface

	public static void main(String[] args) {
		FortlizeHospital obj = new FortlizeHospital();
		obj.cardoServices();
		obj.test();
		//top casting 
		//Child class obj can be refereed by parent interface variable
		
		UsMedical obj1=new FortlizeHospital();
		
		//down casting
		//down casting is not possible in compile time also because we can't create obj for interface
	

	}

}
