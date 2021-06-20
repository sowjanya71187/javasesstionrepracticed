package exceptionHandaling;

public class TrycatchBlack {
     //final is keyword,finally is a block in try 
	//catch block,finalize is used to clenup activity when gc is coming
	//throwable is the super class in the exception hierarchy
	//exception and error both are classes these r chiled of throwable
	//exception is coming becouse of code
	//error is coming bcz of envirement bcz of system bcz of compiler
	String name;
	public static void main(String[] args) {
		int base = 0;
		System.out.println("hi");
		System.out.println("hi");
		System.out.println("hi");
		try {
			TrycatchBlack obj = new TrycatchBlack();
			obj = null;
			obj.name = "tom";
			int i = 9/base;
			System.out.println(i);
		} catch (ArithmeticException e) {
			System.out.println("airthemetic excepption");
			e.printStackTrace();
		}catch(NullPointerException e) {
			System.out.println("NullPointer excepption");
			e.printStackTrace();
		}
		System.out.println("hellow");
		System.out.println("hellow");
		System.out.println("hellow");
	}
	
}
