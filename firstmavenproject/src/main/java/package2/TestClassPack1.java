package package2;

import firstmavenproject.TestClassA;

public class TestClassPack1 { //non-child class of TestClassA in the first package
	
	public static void main(String args[]) {
		TestClassA test4 = new TestClassA();
		test4.display();
		//test4.protectedDisplay();
		//test4.defaultDisplay();
		
	}

}
