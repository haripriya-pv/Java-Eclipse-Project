package abstraction;

public class InterestCalc {

	public static void main(String[] args) {
		Bank b = new Sbi();
		b.rateOfInterest();
		b=new Axis();
		b.rateOfInterest();

	}

}
