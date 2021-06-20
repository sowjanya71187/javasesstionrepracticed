package javacode;

public class JAVA_2_Concatination {

	public static void main(String[] args) {
		String x = "Hello";
		String y = "world";
		//System.out.println(x-y);
		int a = 10;
		int b = 20;
		
		double d1 = 12.33;
		double d2 = 22.33;
		System.out.println(a+b);//30
		System.out.println(a+b+x+y);//30 helloworld
		System.out.println(x+y+a+b);//helloworld1020
		System.out.println(x+y+(a+b));//helloworld30
		System.out.println(10+3+9/3);//10+3+3=16
		System.out.println(10+3+9*3);//10+3+27=40
		System.out.println(d1+d2);
		

	}

}
