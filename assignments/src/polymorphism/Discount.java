package polymorphism;

import java.util.Scanner;

public class Discount {
	public static void main(String[] args) {
		System.out.println("enter the price of dress");
		Scanner sc = new Scanner(System.in);
		double amount =sc.nextDouble();
		OnSeason c1 = new OnSeason();
		double d=c1.getDiscount(amount);
		System.out.println("Discount onseason : "+d);
		c1=new OffSeason();
		double d1=c1.getDiscount(amount);
		System.out.println("Discount on off season : "+d1);
		
		

	}
}
