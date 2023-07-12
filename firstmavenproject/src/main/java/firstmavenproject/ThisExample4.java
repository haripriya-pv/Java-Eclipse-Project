//this can be passed as an argument in the method call.
package firstmavenproject;

public class ThisExample4 {

	public static void main(String[] args) {
		ThisExample4 obj = new ThisExample4();
        obj.testMethod();
	}

	public void testMethod() {
		method2(this);
		
	}

	private void method2(ThisExample4 thisobj) {
		System.out.println("method invoked");
		
	}

}
