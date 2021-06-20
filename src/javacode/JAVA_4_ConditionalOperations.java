package javacode;

public class JAVA_4_ConditionalOperations {

	public static void main(String[] args) {
		int a = 10;
		int b = 30;
		if(a==b) {
		System.out.println("both are equal");
		}
		else {
			System.out.println("both are not equal");

	}
	//dead code
//	if(true) {
//		System.out.println("condition is true");
//	}
//	else {
//		
//	}
		
		if(b>a) {
			System.out.println("b is grater then a");
		}
		else
		{
			System.out.println("a is grater then b");
		}
		//< > >= <= !=
		// &&
		int x = 1000;
		int y = 600;
		int z = 300;
		int g = 900;
		if(x>y && x>z) {
			System.out.println("x is the gretest number");
		}
		else if(y>z && y>g){
			
			System.out.println("y is the gretest number");
		}else if(z>g) {
			System.out.println("z is the gretest number");
		}else
		{
			System.out.println("g is the gretest number");
		}
		
		//String comparition
		String s1 = "Hellow";
		String s2 = "Hellow ";
		
		System.out.println((s1.equals(s2)));
		
	}

}
