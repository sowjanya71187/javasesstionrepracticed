package javacode;

import java.util.ArrayList;

public class JAVA_94_ArrayListMethods {

	public static void main(String[] args) {
		 ArrayList<String> loung =new ArrayList<String>();
		 loung.add("java");
		 loung.add("python");
		 loung.add("c#");
		 loung.add("Ruby");
		 
		 System.out.println(loung);
		loung.set(2, "JavaScript");
		System.out.println(loung);
		loung.add(null);
		System.out.println(loung);
		System.out.println(loung.size());
		loung.remove(3);
		System.out.println(loung);
		System.out.println(loung.size());
		System.out.println(loung.get(3));
		
	}

}
