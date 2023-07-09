package polymorphism;

public class OffSeason extends OnSeason{
	
	public double getDiscount(double price) {
		discount = (price*15)/100;
		return discount;
		
	}

	

}
