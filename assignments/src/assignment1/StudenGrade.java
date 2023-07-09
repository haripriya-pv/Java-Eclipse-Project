// 30. Write a program to find the grade of 2 students based on total marks(3 subjects)
// Get the student‟s marks by constructor  Return total mark to in main method
// Find the grade of each student.

package assignment1;

import java.util.Scanner;

public class StudenGrade {
	static int number;
	int sub1;
	int sub2;
	int sub3;
	static int total;

	public StudenGrade() {

	}

	public StudenGrade(int sub1, int sub2, int sub3) {
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
		System.out.println("marks of student in each subject : ");
		System.out.println(" " + sub1 + " " + sub2 + " " + sub3);
		this.total = sub1 + sub2 + sub3;
		System.out.println("total marks of student " + this.total);

	}

	public static void main(String[] args) {
		StudenGrade obj = new StudenGrade(45, 50, 40);
		obj.grade(total);
		StudenGrade obj1 = new StudenGrade(15, 30, 20);
		obj1.grade(total);
	}

	private void grade(int total2) {
			System.out.println("Grade of student " );
			if (total2 >= 140) {
				System.out.println("grade A");
			} else if (total2 >= 130 && total2 <= 139) {
				System.out.println("grade B");
			} else if (total2 >= 120 && total2 <= 129) {
				System.out.println("grade C");
			} else if (total2 >= 110 && total2 <= 119) {
				System.out.println("grade D");
			} else if (total2 >= 100 && total2 <= 109) {
				System.out.println("grade E");
			} else
				System.out.println("Better luck next time");
	}

}