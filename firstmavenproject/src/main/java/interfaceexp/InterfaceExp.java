package interfaceexp;

public class InterfaceExp implements Printable,Showable{

	public static void main(String[] args) {
		InterfaceExp obj = new InterfaceExp();
		obj.print();
		obj.show();

	}

	@Override
	public void print() {
		System.out.println("Hello");
		
	}

	@Override
	public void show() {
		System.out.println("multiple inheritance example");
		
	}

}
