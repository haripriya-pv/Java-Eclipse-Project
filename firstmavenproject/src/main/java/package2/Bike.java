package package2;

public class Bike extends Vehicle{ // hierarchial inheritance vehicle ->car and vehicle ->bike

	public static void main(String[] args) {
		Bike obj3 = new Bike();
		obj3.wheel =2;
		System.out.println("number of wheels = "+obj3.wheel);
		obj3.display();

	}
	public void display() { // method overriding
		System.out.println("Current class is bike");
	}

}
