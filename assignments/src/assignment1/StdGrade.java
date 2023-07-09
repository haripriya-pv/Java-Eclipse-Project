// 30. Write a program to find the grade of 2 students based on total marks(3 subjects)
// Get the student‟s marks by constructor  Return total mark to in main method
// Find the grade of each student.

package assignment1;

import java.util.Scanner;

public class StdGrade {
	static int number;
	static int sub1[] = new int[3];
	static int sub2[] = new int[3];
	static int sub3[] = new int[3];
	static int total[] = new int[3];

	public StdGrade() {

	}

	public StdGrade(int[] sub12, int[] sub22, int[] sub32) {
		System.out.println("marks of student in each subject : ");
		for (int i = 0; i < number; i++) {
			System.out.println("marks of  student  " + (i + 1) + " : " + sub12[i] + " " + sub22[i] + " " + sub32[i]);
			total[i] = sub12[i] + sub22[i] + sub32[i];
			System.out.println("total marks of student " + (i + 1) + " : " + total[i]);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of students");
		number = sc.nextInt();
		System.out.println("enter the marks of " + number + " students in 3 subjects");
		for (int i = 0; i < number; i++) {
			sub1[i] = sc.nextInt();
			sub2[i] = sc.nextInt();
			sub3[i] = sc.nextInt();
		}

		StdGrade obj = new StdGrade(sub1, sub2, sub3);
		grade(total);
	}

	private static void grade(int[] total2) {
		for (int i = 0; i < number; i++) {
			System.out.println("Grade of student " + (i + 1) + " : ");
			if (total2[i] >= 140) {
				System.out.println("grade A");
			} else if (total2[i] >= 130 && total2[i] <= 139) {
				System.out.println("grade B");
			} else if (total2[i] >= 120 && total2[i] <= 129) {
				System.out.println("grade C");
			} else if (total2[i] >= 110 && total2[i] <= 119) {
				System.out.println("grade D");
			} else if (total2[i] >= 100 && total2[i] <= 109) {
				System.out.println("grade E");
			} else
				System.out.println("Better luck next time");
		}

	}

}
