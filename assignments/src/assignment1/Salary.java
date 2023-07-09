//33. Program to find the total salary by hand of an Employee 
// Class 1 Get basic pay, deduction and bonus from console.
// Class 2 Calculate hra (5% of basic pay) and pf (20% of basic pay).
// Class 3 Find the total salary (basicpay+hra-pf-deduction+bonus) 
//and get the salary slip Salary slip should contains :- basic pay, deduction, hra, pf, bonus and total salary by hand

package assignment1;

import java.util.Scanner;

public class Salary {
	double basicPay;
	double deduction;
	double bonus;
	
	
public void getSalaryDetails() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the basic pay");
	basicPay = sc.nextDouble();
	System.out.println("Enter the deduction amount");
	deduction = sc.nextDouble();
	System.out.println("Enter the bonus");
	bonus = sc.nextDouble();
	
}
}
