package package2;

public class Car extends Vehicle{
	String colour;
	public static void main(String args[]) {
		Car obj1 = new Car();
		obj1.wheel=4;
		System.out.println("number of wheels = "+obj1.wheel);
		obj1.display();
	}

}
