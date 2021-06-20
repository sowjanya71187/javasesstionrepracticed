package oop_Interface;

public interface UsMedical extends WHO {
	
	//in interface there is no main method because there is 
	//no implementation
	// when we talk about class there we see class keyword
	// when we talk about interface there we find interface keyword
	public void pediaServices();
	
	public void cardoServices();
	
	public void physioServices();
	
	// but we can provide parameters here
	public void doctors(int count);
	//we can write return type also
	
	public String getHospInfo(); 
	// for static method implimentation is allowed
	// we can call this static method with the inteface name
	
	public static void bloodTest() {
		System.out.println("blood test given");
	}
	// but we can access this method from normal class obj
	default void test() {
		
	}
		
	
	
		
	
	

}
