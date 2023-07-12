package firstmavenproject;

public class TestClassC extends TestClassA{ //child class of TestClassA 
	public static void main(String args[]) {
		TestClassC test3 = new TestClassC();
		test3.display();
		//test3.testDisplay();
		test3.protectedDisplay();
		test3.defaultDisplay();
	}

}
