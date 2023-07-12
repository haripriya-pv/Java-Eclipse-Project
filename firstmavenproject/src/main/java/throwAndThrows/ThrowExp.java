package throwAndThrows;

public class ThrowExp {

	public static void main(String[] args) {
		isEligible(13);
	}

	public static void isEligible(int i) {
		if(i<18) {
			throw new ArithmeticException("Person is not eligible to vote");
		}
		else
			System.out.println("eligible to vote");
		
	}

}
