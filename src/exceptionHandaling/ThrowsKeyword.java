package exceptionHandaling;

public class ThrowsKeyword {
/**
 * throws,throw,throwable
 * throwable is super class of all the exceptions
 * throws keyword is always used ofter the method name
 * throw is used for customised own exception
 * @param args
 * @throws ArithmeticException
 */
	public static void main(String[] args) throws ArithmeticException{
		/**Throws keyword is just for the pass the exception from 
		 * one method to another method.it is not responsible to
		 * handle the exception it throw multiple exceptions also
		 * 
		 */
		ThrowsKeyword k = new ThrowsKeyword();
		k.m1();
		
		
/**we con't use throws keyword like that becouse main method ownt
 * handle it.we have to use try catch black to handle exception.
 */
	}
	public void m1()throws ArithmeticException,NullPointerException{
		System.out.println("m1");
		m2();
	}
     public void m2()throws ArithmeticException{
    	 System.out.println("m2");
    	 m3();
	}
     public void m3()throws ArithmeticException{
    	 System.out.println("m3");
    	 m4();
     }
     public void m4()throws ArithmeticException{
    	 System.out.println("m4");
    	 int i = 9/0;
     }
     public void m5(){
    	 System.out.println("m1");
     }

}
