package firstmavenproject;

public class TestClassB { //non-child class of TestClassA 
	
	public static void main(String args[]) {
		TestClassA test2 = new TestClassA();
		test2.display();
		//test2.testDisplay();
		test2.protectedDisplay();
		test2.defaultDisplay();
	}

}
