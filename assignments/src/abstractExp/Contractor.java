package abstractExp;

import java.util.Scanner;

public class Contractor extends Employee {

	@Override
	public void calculateSalary() {
		System.out.println("Enter the working hours of contract employee");
		Scanner sc = new Scanner(System.in);
		hour = sc.nextInt();
		salaryPerHour = 500;
		totalSalary = hour*salaryPerHour;
		System.out.println("total per day salary of contract employee = "+totalSalary);
		
	}

}
