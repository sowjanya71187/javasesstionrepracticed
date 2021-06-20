package finalize;

public class Employee {
/**
 * in java Object is the parent of all the classes
 * in the object finalize is the method
 * so we overrde  this methos from there
 * this finalize method will be called before any cleanup activity
 * gc will do this clean up activity
 * to call gc we use system.gc method
 * 
 */
	@Override
	public void finalize() {
		System.out.println("this is emp class finalize method");
		//this method will be called before any clean up activity
		// done by garbage collector
	}
	
	public static void main(String[] args) {
		System.out.println("emp class.....");
		//*** when we destroing person class obj  finalize metho will not come
		// if we create finalize method at person class 
		//yes we can call it.it is requred to ovrride class to class
		//for clean up activity
		// normally without calling explicitly gc will not destory obj
		//without full the memory jvm will tack CARE about this
		
		Person p = new Person();
	   p = null;
	    
		//** when we destroing employee class it will come becouse we 
		//overriden in this class
	    Employee e = new Employee();
	    e = null;
		System.gc();
		System.out.println("emp class is done....");
		
	}

}
