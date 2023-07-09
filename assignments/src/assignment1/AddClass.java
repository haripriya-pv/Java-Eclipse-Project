//36. Program to check the addition result is divisible by 10
// Class 1 Return addition result of two numbers  Class 2 Check the addition result is divisible by 10(use super keyword)


package assignment1;

import java.util.Scanner;

public class AddClass {
	int result;
	int a,b;
	public int add() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers to add");
		a=sc.nextInt();
		b=sc.nextInt();
		result = a+b;
		return result;
		
	}

}
