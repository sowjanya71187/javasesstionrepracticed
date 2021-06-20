package javacode;

public class JAVA_3_IncrementalandDecrementalConcept {

	public static void main(String[] args) {
		//Post increment
		int m = 1;	
		int n = m++;
		System.out.println(m);//2
		System.out.println(n);//1
		int p = -99;
		int q = p++;
		System.out.println(p);//-98
		System.out.println(q);//-99
  
		//pre increment
		int a = 1;
		int b = ++a;
		System.out.println(a);//2
		System.out.println(b);//2
		
		//post decrement: - 
		int k = 5;
		int l = k--;
		System.out.println(k);//4
		System.out.println(l);//s
		//pre decrement:-
		int f = 5;
		int e = --f;
		System.out.println(f);//4
		System.out.println(e);//4
		
		int r = 6;
      System.out.println(++r);
     // System.out.println(r++);
      
	}

}
