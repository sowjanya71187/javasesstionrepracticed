package exceptionHandaling;

public class FinallyBlock {

	//finally block is used for mandatery code like closing database
	//finally block will work at any point 
	public static void main(String[] args) {
		System.out.println("l");
		try {
			int i = 9/3;
			System.out.println(i);
		}catch(NullPointerException e) {
			System.out.println("NullPointer excepption");
			e.printStackTrace();
		}catch (ArithmeticException e) {
			System.out.println("airthemetic excepption");
			e.printStackTrace();
		}
			finally {
			System.out.println("its not NullPointer its airthemetic excepption");
		}
		System.out.println("o");
		System.out.println("v");
		System.out.println("e");
		System.out.println("r");
     System.out.println(getmarks("ramu"));
	}
	
	public static int getmarks(String name) {
		if(name.equals("ramu")) {
			return 50;
		}else if(name.equals("sowji")){
			try {
				int k = 9/0;
						return 40;		
			}catch(ArithmeticException e){
				return 60;
			}finally {
				System.out.println("it is finally block now");
				//return 30; 
				//finally block return will override reaming return 
			}
			
		}
		return -1;
		
	}

}
