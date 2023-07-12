package firstmavenproject;

public class TestClassA {
	
	public void display() {
		System.out.println("this is first class public method");
	}
	public static void main(String args[]) {
		TestClassA test1 = new TestClassA();
		test1.display();
		test1.testDisplay();
		test1.defaultDisplay();
	}
	
	private void testDisplay() {   // only accessible inside the same class's main method
		System.out.println("this is first class private method");
	}
	
	protected void protectedDisplay() {   //accessible inside same package and child class of this class in another package
		System.out.println("this is first class protected method");
	}
	
	void defaultDisplay() {   //only accessible inside same package
		System.out.println("this is first class default method");
	}


}
