package javacode;

public class JAVA_97_Person {
	String name;
	int age;
	String city;

	public static void main(String[] args) {
		JAVA_97_Person p1 =new  JAVA_97_Person();
		p1.name = "ramu";
		p1.age = 38;
		p1 .city = "canada";
		
		JAVA_97_Person p2 =new  JAVA_97_Person();	
		p2.name = "sowji";
		p2.age = 33;
		p2 .city = "india";
		
		JAVA_97_Person p3 =new  JAVA_97_Person();	
		p3.name = "ishu";
		p3.age = 8;
		p3 .city = "india";
		System.out.println(p1.name+" "+p1.age+" "+p1.city);
		System.out.println(p2.name+" "+p2.age+" "+p2.city);
		System.out.println(p3.name+" "+p3.age+" "+p3.city);
		p1 = p2;//Reference exchange
		p2=p3;
		p3=p1;
		System.out.println(p1.name+" "+p1.age+" "+p1.city);
		System.out.println(p2.name+" "+p2.age+" "+p2.city);
		System.out.println(p3.name+" "+p3.age+" "+p3.city);
		
		
		
		
		
	}

}
