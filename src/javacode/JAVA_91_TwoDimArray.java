package javacode;

public class JAVA_91_TwoDimArray {

	public static void main(String[] args) {
		int mynum[][] = {
				{1,2,3,4},
				{10,20,30,40,50},
				{100,200,300,400,500,600}
			};
		for(int i=0;i<mynum.length;i++) {
			for(int j=0;j<mynum[i].length;j++) {
				System.out.print(mynum[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("++++++++++++++++++++++++++++++");
		//for each loop
		for(int e[]:mynum) {
			for(int p:e) {
				System.out.println(p);
			}
		}
				
			
		
		int data[][]= new int[4][5];
		data[0][0]=10;
		data[0][1]=20;	
		data[3][4]=40;
		
		//System.out.println(data[4][5]);
	}

}
