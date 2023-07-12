package throwAndThrows;

public class ThrowsExp {

	public static void main(String[] args) {
		ThrowsExp obj = new ThrowsExp();
		try {
			
			System.out.println(obj.devide(10,0));
		}
		catch(ArithmeticException e) {
			System.out.println("number can not devided by zero");
		}
		System.out.println("rest of the code");

	}

	public static float devide(int i, int j)throws ArithmeticException {
		float result = i/j;
		return result;
	}

}
