package firstmavenproject;

public class ThisExample2 {
	String name;

	public ThisExample2() {
		this.name = "Hari";
	}

	public ThisExample2(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		ThisExample2 std1 = new ThisExample2();
		ThisExample2 std2 = new ThisExample2("Priya");
		std1.display();
		std2.display();

	}

	private void display() {
		System.out.println(name);
		
	}

}
