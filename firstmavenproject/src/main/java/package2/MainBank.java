package package2;

public class MainBank {
	public static void main(String args[]) {
		Bank b;
		b= new Sbi(); //upcasting 
		System.out.println(b.getRateOfInterest());
		b = new Axis();
		System.out.println(b.getRateOfInterest());
		b = new Icici();
		System.out.println(b.getRateOfInterest());
		
	}

}
