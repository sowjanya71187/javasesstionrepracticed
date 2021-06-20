package javacode;

import java.util.ArrayList;


public class JAVA_95_ArrayListwithStreams {
/**
 * ArryList.add adding the value
 * ArrayList.set update the value set(index,value)
 * ArrayList.get get the value
 * ArrayList.remove remove the value
 * @param args
 */
	public static void main(String[] args) {
		ArrayList<String> loung =new ArrayList<String>();
		 loung.add("java");
		 loung.add("python");
		 loung.add("c#");
		 loung.add("Ruby");
		 long sttime = System.currentTimeMillis();
		 loung.stream().forEach(ele -> System.out.println(ele));
		 long endtime = System.currentTimeMillis();
		 System.out.println(endtime-sttime);
		 loung.parallelStream().forEach(e ->System.out.println(e) );

	}

}
