package javacode;

public class JAVA_98_EcomAPP {
	public void search() {
		
	}
    public void search(String name,int price) {
		
	}
    public void payment(String card ,int amount) {
    	
    }
    public String bookingcab(String starting ,String ending) {
    	System.out.println(starting+ " to "+ending);
    	return "booked";
    }
    public boolean bookingcab(String starting ,String ending,String carType, double rating) {
    	System.out.println(starting+" to "+ending+" to "+carType+" rating: "+rating);
   return true;
    
    }
    

	public static void main(String[] args) {
		JAVA_98_EcomAPP cab = new JAVA_98_EcomAPP();
		String book=cab.bookingcab("mauri", "kenada");
		System.out.println(book);
		boolean rating=cab.bookingcab("mayuri", "kenada", "nano" , 5);
		System.out.println(rating);
	}

}
