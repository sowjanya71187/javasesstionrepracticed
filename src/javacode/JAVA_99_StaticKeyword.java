package javacode;

public class JAVA_99_StaticKeyword {
	String name;
	static int age;
	public void test() {
		System.out.println("test method");
	}
	public static void getmail() {
		
		System.out.println("getmail method");
	}

	public static void main(String[] args) {
		
		age=33;
		JAVA_99_StaticKeyword obj = new JAVA_99_StaticKeyword();
		obj.name = "sowji";
		obj.test();
		obj.age = 45;//it showing worning becouse it is static in nature.
		JAVA_99_StaticKeyword.age = 63;
		JAVA_99_StaticKeyword.getmail();
		

	}

}
