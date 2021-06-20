package javacode;

public class JAVA_96_TimeComplexcity {

	public static void main(String[] args) {
		// Time Complexity
		//BIG O
		//n n^2 n^3 1
		int i = 10;
		System.out.println(i);
		//0(1) constant time
		
		for(int i1=0;i1<=10;i1++) {
			System.out.println(i);
		}
		//1+n+n+n = 1+3n = 3n =n O(n)
		//Linear Equation
		
		for(int m=1;m<=9;m++) {
			for(int n=1;n<=9;n++) {
				System.out.print(m+""+n+" ");
			}
			System.out.println();
		}
		//(1+n+n+n)(1+n+n+n)
		//(1+3n)(1+3n)
		//(1+3n+3n+9n^2)
		//(1+6n+9n^2) //Qudratic Equation
		//(9n^+6n)
		//3(3n^2+2n)
		//3n^2+2n
		//n^2+n
		//n(n+1)
		//n(n)
		//o(n^2)

	}

}
