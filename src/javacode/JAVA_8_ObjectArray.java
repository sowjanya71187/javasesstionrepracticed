package javacode;

public class JAVA_8_ObjectArray {

	public static void main(String[] args) {
		Object emp[] = new Object[5];
		emp[0]="sowjanya";
		emp[1]=33;
		emp[2]=70.12;
		emp[3]='f';
		emp[4]= true;
		
		for(int i=0;i<emp.length;i++) {
			System.out.println(emp[i]);
		}

	}

}
