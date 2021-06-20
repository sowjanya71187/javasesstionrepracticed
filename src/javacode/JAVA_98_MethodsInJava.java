package javacode;

public class JAVA_98_MethodsInJava {
	/*
	 * methods are independent to each other
	 * no method inside a mathod
	 * 
	 * A mthod cannot return anything means void
	 */
	int age;
	String name;
	//1.1.no input no return
	public void test() {
		System.out.println("test method");
	}
	//2. no input some return
	// return type = int
	public int getscore() {
		System.out.println("getScore");
		int score = 100;
		int bal = 20;
		int finalScore = score+bal;
		return finalScore;
	}
	//3.some input some return
	public int add(int a , int b) {
		System.out.println("add method");
		int sum =a+b;
		return sum;
	}

	public static void main(String[] args) {
		
		System.out.println("main method");
		JAVA_98_MethodsInJava obj = new JAVA_98_MethodsInJava();
		obj.name = "sowjanya";
		obj.age = 33;
		obj.test();
		int score=obj.getscore();
		System.out.println(score);
		int value=obj.add(30, 40);
		System.out.println(value);
	}

}
