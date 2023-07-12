package package2;

import firstmavenproject.TestClassA;

public class TestClassPack3 extends TestClassA {  //child class of TestClassA in first package
	public static void main(String args[]) {
		TestClassPack3 test5 = new TestClassPack3();  // calling parent class method in anther package
		test5.display();
		test5.protectedDisplay();
		//test5.defaultDisplay();
	}

}
