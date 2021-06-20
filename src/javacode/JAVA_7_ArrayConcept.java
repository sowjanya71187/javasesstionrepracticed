package javacode;

public class JAVA_7_ArrayConcept {

	public static void main(String[] args) {
		// similar type of data in array
		//array size is fixed
		//int array:
		//1.//static arrayS
		int i[] = new int[10];
		//i[-1]=45;
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		i[6]=80;
		System.out.println("+++++++++++++++++++++++++++++++++");
		System.out.println(i[6]);
		System.out.println("+++++++++++++++++++++++++++++++++");
//		System.out.println(i[0]);//10
//		System.out.println(i[4]);//ArrayIndexOutOfBoundsException
//		System.out.println(i[-1]);//ArrayIndexOutOfBoundsException
		
     for(int k=0;k<i.length;k++) {
    	 System.out.println(i[k]);
     }
	//2.double array
     double d[]= new double[2];
     d[0]=12.33;
     d[1]=13.55;
     
     
     //3.char array
      char c[]= new char[3];
     c[0]='s';
     c[1]='o';
     c[2]='w';
     
     //4.String array
     String names[]=new String[3];
     names[0]="divaya";
     names[1]="ravi";
     names[2]= "kavitha";
     
     System.out.println(names[0]);
     for(int f=0;f<names.length; f++) {
    	 System.out.println(names[f]);
     }
     System.out.println("======================");
     //for each loop
     for(String e : names) {
    	 System.out.println(e);
    	 
     }
     
     
	}

}
