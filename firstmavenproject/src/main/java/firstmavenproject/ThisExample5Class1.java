//this: to pass as argument in the constructor call

package firstmavenproject;

public class ThisExample5Class1 {
	int number = 25;

	public static void main(String[] args) {
		ThisExample5Class1 obj = new ThisExample5Class1();

	}

	public ThisExample5Class1() {
		ThisExample5Class2 objclass2 = new ThisExample5Class2(this);
		objclass2.display();
	}

}
