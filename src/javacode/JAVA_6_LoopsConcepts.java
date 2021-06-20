package javacode;

public class JAVA_6_LoopsConcepts {

	public static void main(String[] args) {
		//While loop
		//print 1 to 10
//		int i = 1;//intialization
//		while(i<=10)// condition {
//			System.out.println(i);
//		//	i++;
//		//	++i;
//			i=i+1;
//		}
	
	
	//print 10 to 1
//	int k = 10;
//	while(k>=0) {
//		System.out.println(k);
//		k--;
//	}
		
		int p = 1;
	 while(p<=100) {
		 System.out.println(p);
		 if(p%5==0) {
			 System.out.println("hiiiiiiiiiii-----------");
			 break;
		 }
		 p++;
	 }
	 System.out.println("===========================");
	 //For Loop
	 for(int m =1 ; m<=10;m++) {
		 System.out.println(m);
	 }
	 System.out.println("============even numbers===============");	
		
	 for(int k =0 ; k<=10;k=k+2) {
		 System.out.println(k);
	 }	
		
	//do while loop
	 System.out.println("============do while loop===============");	
	 int n =1;
	 do {
		 System.out.println(n);
		 n++;
	} while (n<=10);
	 System.out.println("-----------------------------");
	 
	 for(int a=0;a<=3;a++) {
		 for(int b=0;b<=3;b++) {
			 System.out.print(a+""+b+" ");
		 }
		 System.out.println();
	 }
		
		
}
	}



