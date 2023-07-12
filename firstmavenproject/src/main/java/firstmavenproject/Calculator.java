package firstmavenproject;

public class Calculator {
	int a, b;
	static double pi = 3.14;

	public Calculator() {

	}

	public Calculator(int a, int b) { //parameterized constructor
		this.a = a;
		this.b = b;
	}

	public static void main(String[] args) {
		Calculator obj1 = new Calculator(10, 15);
		obj1.add();       //instance method calling
		sub(45, 10);   //static method calling
		int radious = 10;
		double circleArea = area(radious); //static method calling
		System.out.println("area of circle: " + circleArea);
		Calculator obj2 = new Calculator();
		double circlePerimeter = obj2.perimeter(radious);   //instance method calling
		System.out.println("perimeter of circle: " + circlePerimeter);
		// use the escape character
		String example = "This is the \"String\" class.";
		System.out.println(example);
		example = example.concat(" World");
		System.out.println(example);
	
	}

	public double perimeter(int radious) {
		double perimeter = 2 * pi * radious;
		return perimeter;
	}

	public static double area(int i) {
		double area = pi * i * i;
		return area;
	}

	public static void sub(int a, int b) {
		System.out.println(a - b);

	}

	public void add() {
		System.out.println(a + b);

	}

}
