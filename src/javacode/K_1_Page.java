package javacode;
/**
 * we can call static method any where becouse it is in cma
 * but we can't call normal method in static method becouse 
 * we have to use obj for calling
 *
 */
public class K_1_Page {
	public static void t1() {
		System.out.println("hai t1");
		t2();
	}
   public static void t2() {
	   System.out.println("hello t2");
		t3();
	}
    public static void t3() {
    	System.out.println("bye t3");
    }

	public void lounch() {
		t1();
		System.out.println("lounch");
		header();
	}
	public void header() {
		System.out.println("header");	
		title();
	}
	public void title() {
		System.out.println("title");
		close() ;
	}
	public void close() {
		System.out.println("close");
	}
	public static void main(String[] args) {
		K_1_Page obj = new K_1_Page();
		obj.lounch();
	}
}
