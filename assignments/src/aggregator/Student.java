//37. Write a program to get the details of a Student 
// Class 1 - Student Get the student name and roll number 
// Class 2- Address Get the address of student Print Student name, roll number with address  There is no IS-A relationship

package aggregator;

import java.util.Scanner;

public class Student {
	String name;
	int rollNo;
	Address ads;

	public void getDetails() {
		System.out.println("Enter student name and roll number");
		Scanner sc = new Scanner(System.in);
		name = sc.nextLine();
		rollNo = sc.nextInt();
	}

	public static void main(String args[]) {
		Student std = new Student();
		std.display();
	}

	public void display() {
		getDetails();
		ads = new Address();
		ads.getAddress();
		System.out.println("............Student details.....");
		System.out.println("......id " + rollNo);
		System.out.println("......name " + name);
		System.out.println(".............Address............");
		System.out.println("......city " + ads.city);
		System.out.println("......country " + ads.country);
		System.out.println("......state " + ads.state);
		System.out.println("......zip " + ads.zip);
	}
}
