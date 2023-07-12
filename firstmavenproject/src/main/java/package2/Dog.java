package package2;

public class Dog extends Animal{
	String colour = "Black";

	public Dog() {
		super();   //calling parent class constructor
		System.out.println("Dog is created........");
	}

	public static void main(String[] args) {
		Dog d = new Dog();
		System.out.println("Dog class........."+d.colour);
	    d.methodColour();
	    
	}

	public void methodColour() {
		System.out.println("Parent class........."+super.colour);//calling parent class fields, super keyword cannot be used in static methods
		super.work(); //calling parent class method
		
	}

}
