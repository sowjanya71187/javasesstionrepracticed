package exceptionHandaling;

public class ThrowKeyword {

	public static void main(String[] args) {
		try {
		throw new Exception("y this happenning with me");
		}catch(Exception e) {
			System.out.println("some exception is comming");
			e.printStackTrace();
		}

	}

}
