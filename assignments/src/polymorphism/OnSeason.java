// 38. Program to calculate discount If customer purchase clothes on Offseason, set discount 15% and on Onseason 40% 
// Should use two classes, Onseason and Offseason  Use two methods- discount(method name should be same)


package polymorphism;

public class OnSeason {
	double discount;
	public double getDiscount(double price) {
		discount = (price*40)/100;
		return discount;
		
	}

}
