package interfaceExp;

import java.util.Scanner;

public class Hdfc implements Rbi {

	@Override
	public void recurringDeposit(double a, int d) {

		double total = a * d + a * ((d * (d + 1)) / 2) * intrestRate * 1 / 12;
		// a = p * n + p * ((n * (n + 1)) / 2) * (r / 100) * (1 / 12.0);
		System.out.println("You will get the amount " + total + " after " + d + " months");

	}

	public static void main(String Args[]) {
		System.out.println("Enter the Amount to deposit");
		Scanner sc = new Scanner(System.in);
		int amount = sc.nextInt();
		System.out.println("Enter the number months");
		int duration = sc.nextInt();
		Hdfc c1 = new Hdfc();
		c1.recurringDeposit(amount, duration);
	}

}
