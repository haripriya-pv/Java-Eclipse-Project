package package2;

public class Audi extends Car { // multi-level inheritance (vehicle->car->audi)
	public static void main(String args[]) {
		Audi obj2 = new Audi();
		obj2.colour ="blue";
		System.out.println("Car colour is "+obj2.colour);
		obj2.display();
	}

}
