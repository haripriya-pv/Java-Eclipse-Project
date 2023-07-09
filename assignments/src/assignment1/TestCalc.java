// 29. Write the above program with parameterized constructor (to calculate total amount).
//(instance methods)

package assignment1;

import java.util.Scanner;

public class TestCalc {
	static double total;
	double x;
	double y;
	double z;
    int a;
    int b;
    int c;
	public TestCalc(double x, double y, double z) {
		this.x=x;
		this.y=y;
		this.z=z;
		total = x + y + z;

	}
	public TestCalc(int a, int b, int c) {
		this.a=a;
		this.b=b;
		this.c=c;
		total = a + b + c;

	}

	public TestCalc() {

	}

	public static void main(String[] args) {
		
		TestCalc obj = new TestCalc(10, 20, 30);
		System.out.println("Average of three integers : " + total / 3);
		Scanner sc=new Scanner(System.in);
		TestCalc obj1 = new TestCalc(0.5,2.5,3.5);
		System.out.println("Average of three float numbers : " + total / 3);
		System.out.println("Enter the radious of circle");
		int radious = sc.nextInt();
		TestCalc obj2 = new TestCalc();
		obj2.area(radious);
		System.out.println("Enter the length and breadth of rectangle");
		int l = sc.nextInt();
		int br = sc.nextInt();
		TestCalc obj3 = new TestCalc();
		obj3.area(l, br);
		System.out.println("Enter the length of square");
		float len = sc.nextFloat();
		TestCalc obj4 = new TestCalc();
		obj4.area(len);

	}

	public void area(float len) {
		System.out.println("Area of square : " + (len * len));

	}

	public void area(int rad) {
		System.out.println("Area of circle : " + (3.14 * rad * rad));

	}

	public void area(int l, int br) {
		System.out.println("Area of rectangle : " + (l * br));

	}

}
