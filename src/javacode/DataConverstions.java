package javacode;

public class DataConverstions {

	public static void main(String[] args) {
		
		// String to integer data conversion
		
	   String x = "100";
	   System.out.println(x+100);
	  int i = Integer.parseInt(x);
	   System.out.println(i+100);
	   String total = "5000";
	   int value = Integer.parseInt(total)-30+45;
	   System.out.println(value);
	   
	   String y = "100A";
	  String[] f=y.split("A");
	   int k = Integer.parseInt(f[0]);
	   
	   
	   System.out.println(k+20);
	   //String to double:
	   String p = "12.33";
	  double d = Double.parseDouble(p);
	  System.out.println(d+20);
	  
	  int marks = 100;
	  
	  String s = String.valueOf(marks);
	  System.out.println(s+20);  
	   
	  boolean flag = true;
	  System.out.println(flag+"Bye");

	}

}
