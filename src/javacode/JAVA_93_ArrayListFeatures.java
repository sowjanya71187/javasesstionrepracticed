package javacode;

import java.util.ArrayList;

public class JAVA_93_ArrayListFeatures {

	public static void main(String[] args) {
		// add method can add the values 
		// get method can give the values
		ArrayList<Integer> markList =new ArrayList<Integer>();
		markList.add(100);//0
		markList.add(200);//1
		markList.add(300);//2
		markList.add(400);//3
		System.out.println(markList.get(3));
		//System.out.println(markList.get(4));//index out box exception
		//markList.add(6, 1000);
		//System.out.println(markList.get(6));//you can add like this
		System.out.println("-----------------------------");                                     // in arraylist
		System.out.println(markList);//we cont do this in Array concepts
		// we do this becouse of to string overrriding
		//for loop
		System.out.println("-----------------------------"); 
		for(int i=0;i<markList.size();i++) {
			System.out.println(markList.get(i));
		}
		//for each loop
		System.out.println("-----------------------------"); 
		for(Integer e:markList) {
			System.out.println(e);
		}
		
	}

}
