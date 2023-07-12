package firstmavenproject;

public class ThisExample3 {
	int i;

	public ThisExample3() {
		//this(10);
		System.out.println("Default constructor");
	}
	

	public ThisExample3(int i) {
		this();     //need to add as first line , constructor chaining
		this.i=i;
		System.out.println("value: "+i);
	}


	public static void main(String[] args) {
		ThisExample3 obj = new ThisExample3(10);
	}

}
