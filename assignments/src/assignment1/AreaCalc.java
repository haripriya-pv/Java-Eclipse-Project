// 31. Write a program to find the Area of figures a) Circle (pi*r*r) b) Rectangle(l*b) c) Square(a*a) 
// Prompt the user to select the options(a/b/c) from command prompt. 
// Get the inputs that needs to find area.

package assignment1;

import java.util.Scanner;

public class AreaCalc {

	public AreaCalc() {

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Select the figure you need to know the area");
		System.out.println("a)circle" + "\n" + "b)rectangle" + "\n" + "c)square" + "\n");
		char figure = sc.next().charAt(0); ;
		if (figure == 'a') {
			System.out.println("Enter the radious of circle");
			int radious = sc.nextInt();
			area(radious);
		} else if (figure == 'b') {
			System.out.println("Enter the length and breadth of rectangle");
			int l = sc.nextInt();
			int br = sc.nextInt();
			area(l, br);
		} else {
			System.out.println("Enter the length of square");
			float len = sc.nextFloat();
			area(len);
		}

	}

	private static void area(float len) {
		System.out.println("Area of square : " + (len * len));

	}

	private static void area(int l, int br) {
		System.out.println("Area of rectangle : " + (l * br));

	}

	private static void area(int radious) {
		System.out.println("Area of circle : " + (3.14 * radious * radious));

	}

}
