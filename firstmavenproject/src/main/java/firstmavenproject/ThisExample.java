package firstmavenproject;

public class ThisExample {

	private String name;
	private int id;

	public ThisExample() {
		
	}

	public ThisExample(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public static void main(String[] args) {
		ThisExample obj = new ThisExample("Hari",12);
		ThisExample obj1 = new ThisExample("Hari",12);
		obj1.m();

	}
	public void m() {
		System.out.println("m is invoked");
		n();
	}

	private void n() {
		System.out.println("n is invoked");
		
	}

}
