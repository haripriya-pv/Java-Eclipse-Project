//28. Write a program to find the 
//a) Average of three integer numbers, three float numbers(should have same method name)
//b) Area of figures(circle, rectangle, square) by using three methods(should have same method name)

package assignment1;

import java.util.Scanner;

public class TestCalculator {

	public TestCalculator(int x, int y, int z) {
		System.out.println("Average of three numbers : " + (x + y + z) / 3);

	}

	public TestCalculator(float l, float m, float n) {
		System.out.println("Average of three numbers : " + (l + m + n) / 3);
	}

	public TestCalculator() {

	}

	public static void main(String[] args) {
		System.out.println("Enter three integers to find average");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		TestCalculator obj = new TestCalculator(a, b, c);
		System.out.println("Enter three float numbers to find average");
		float p = sc.nextFloat();
		float q = sc.nextFloat();
		float r = sc.nextFloat();
		TestCalculator obj1 = new TestCalculator(p, q, r);
		System.out.println("Enter the radious of circle");
		int radious = sc.nextInt();
		TestCalculator obj2 = new TestCalculator();
		obj2.area(radious);
		System.out.println("Enter the length and breadth of rectangle");
		int l = sc.nextInt();
		int br = sc.nextInt();
		obj2.area(l, br);
		System.out.println("Enter the length of square");
		float len = sc.nextFloat();
		obj2.area(len);
	}

	public void area(float len) {
		System.out.println("Area of square : " + (len * len));

	}

	public void area(int l, int br) {
		System.out.println("Area of rectangle : " + (l * br));

	}

	public void area(int rad) {
		System.out.println("Area of circle : " + (3.14 * rad * rad));

	}

}
