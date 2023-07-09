package aggregator;

import java.util.Scanner;

public class Address {
	String city;
	String country;
	String state;
	int zip;
	Scanner sc1 = new Scanner(System.in);

	public void getAddress() {

		System.out.print("enter your city");
		city = sc1.next();
		System.out.println("enter your country");
		country = sc1.next();
		System.out.println("enter your state");
		state = sc1.next();
		System.out.println("enter your zip");
		zip = sc1.nextInt();

		// sc.close();
	}

}
