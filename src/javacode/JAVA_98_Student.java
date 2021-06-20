package javacode;

public class JAVA_98_Student {
	
	public int getStudentMarks(String studentName) {
		System.out.println("Student name is:"+studentName );
		if(studentName.equals("ramu")) {
			return 90;
		}
		else if(studentName.equals("sowji")) {
			return 70;
		}else if(studentName.equals("ishu")) {
			return 100;
		}else
		{
			System.out.println("please pass the current name");
			return -1;
		}
		
	}
	public int getStMarks(String studentName) {
		System.out.println("Student name is:"+studentName );
		int marks = -1;
		if(studentName.equals("ramu")) {
			marks = 90;
		}
		else if(studentName.equals("sowji")) {
			marks = 70;
		}else if(studentName.equals("ishu")) {
			marks = 100;
		}else
		{
			System.out.println("please pass the current name");
			
		}
		return marks;
		
	}

	public static void main(String[] args) {
		
		JAVA_98_Student obj = new JAVA_98_Student();
		int marks=obj.getStudentMarks("valli");
		System.out.println(marks);
	  

	}

}
