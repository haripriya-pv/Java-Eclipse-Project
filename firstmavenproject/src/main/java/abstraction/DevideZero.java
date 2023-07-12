package abstraction;

public class DevideZero extends DevideClass{

	public static void main(String[] args) {
		DevideZero obj = new DevideZero();
		obj.devide();

	}

	@Override
	void devide() {
		num=10;
		float devide = 0;
		try {
		devide = num/0;
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println(devide);
		
	}

}
