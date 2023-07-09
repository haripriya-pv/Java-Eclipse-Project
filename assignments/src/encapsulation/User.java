//39. Program to withdraw amount from an ATM  Class 1- Bank One method to set pin from „User‟ class and 
//validate Pin in another method [Valid pins – 1001, 1234, 1212] Pin number should declared as private 
// Class 2 – User Get the pin from User


package encapsulation;

import java.util.Scanner;

public class User extends Bank{
       
	public static void main(String[] args) {
		System.out.println("Enter the pin number");
		Scanner sc = new Scanner(System.in);
		int pin = sc.nextInt();
		User obj = new User();
		obj.setPin(pin);
		obj.validatePin();
	}

}
