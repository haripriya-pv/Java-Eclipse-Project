//35. Program to find the factorial of a number  Two methods, one for find calculate and other for print result. 
// Pass the number as argument  Main method allows to invoke only one method

package assignment1;

public class ThisExample2 {

	public static void main(String[] args) {
		ThisExample2 obj = new ThisExample2();
		obj.findFact(10);
		
	}

	public void findFact(int i) {
		int fact=1;
		int c=1;
		while(c<=i) {
			fact = fact*c;
			c++;
		}
		displayResult(fact);
	}

	public void displayResult(int fact) {
		System.out.println("factorial = "+fact);
		
	}

}
