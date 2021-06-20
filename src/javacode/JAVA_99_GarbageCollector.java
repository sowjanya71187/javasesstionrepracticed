package javacode;

public class JAVA_99_GarbageCollector {

	public static void main(String[] args) {
		
		JAVA_99_GarbageCollector obj = new JAVA_99_GarbageCollector();
		obj = null;
		System.gc();
	}

}
