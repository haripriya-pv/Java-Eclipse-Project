package test;

import java.util.Arrays;
import java.util.Scanner;

public class ClassTest {

	double average = 0;
	static int number;
	static String firstName[] = new String[10];
	static String lastName[] = new String[10];;
	private static double[] salary = new double[10];

	public ClassTest() {

	}

	public ClassTest(String[] firstName2, String[] lastName2, double[] salary2) {
		for (int i = 0; i < number; i++) {
			System.out.println(firstName[i] + " " + lastName[i] + "   " + salary2[i]);

		}
	}

	public static void main(String[] args) {
		System.out.println("Enter the number of employees");
		Scanner sc = new Scanner(System.in);
		number = Integer.parseInt(sc.nextLine());
		System.out.println("enter the first name of 10 employees");
		for (int i = 0; i < number; i++) {
			firstName[i] = sc.nextLine();

		}
		System.out.println("enter the last name of 10 employees");
		for (int j = 0; j < number; j++) {
			lastName[j] = sc.nextLine();
		}
		System.out.println("enter the salary of 10 employees");
		for (int k = 0; k < number; k++) {
			salary[k] = sc.nextDouble();
		}

		ClassTest avg = new ClassTest();
		avg.average(salary);
		avg.highSalary(salary);
		// avg.orderTest(firstName,lastName,salary);
		avg.testVowel(lastName, firstName);
		avg.testReverse(firstName, lastName);
		ClassTest emp1 = new ClassTest(firstName, lastName, salary);
	}

	public void testReverse(String[] firstName2, String[] lastName2) {
		System.out.println("reverse name ");
		for (int i = 0; i < number; i++) {
			StringBuffer sbfr = new StringBuffer(firstName2[i]);
			StringBuffer sbfr1 = new StringBuffer(lastName2[i]);
			System.out.println(sbfr.reverse() + "  " + sbfr1.reverse());
		}

	}

	public void testVowel(String[] lastName2, String[] firstName2) {
		System.out.println("last name with vowel ");
		for (int i = 0; i < number; i++) {

			/*
			 * if(lastName2[i].charAt(i) == 'a'|| lastName2[i].charAt(i) == 'e'||
			 * lastName2[i].charAt(i) == 'i' || lastName2[i].charAt(i) == 'o' ||
			 * lastName2[i].charAt(i) == 'u')
			 */

			if (lastName2[i].contains("a") || lastName2[i].contains("e") || lastName2[i].contains("i")
					|| lastName2[i].contains("o") || lastName2[i].contains("u")) {

				System.out.println(firstName2[i] + " " + lastName2[i]);
			}

		}

	}

	private void orderTest(String[] firstName2, String[] lastName2, double[] salary2) {

		Arrays.sort(firstName2);
		for (int i = 0; i < firstName2.length; i++) {
			System.out.println(firstName2 + "  ");
		}

	}

	private void highSalary(double[] salary2) {
		double[] temp = new double[number];
		int j = 1;
		for (int i = 0; i < number; i++) {
			for (j = 1; j < number - i; j++) {
				if (salary2[j - 1] > salary2[j]) {
					temp[j] = salary2[j - 1];
					salary2[j - 1] = salary2[j];
					salary2[j] = temp[j];
				} else
					salary2[j] = salary2[j];
			}
		}
		for (int k = 0; k < salary2.length; k++) {

			System.out.print(salary2[k] + "  ");

		}

		System.out.println("highest salary : " + salary2[number - 1]);
	}

	private void average(double[] salary2) {
		double total = 0;
		for (int i = 0; i < number; i++) {
			total = total + salary2[i];
		}
		System.out.println("Average salary : " + (total / number));

	}

}
