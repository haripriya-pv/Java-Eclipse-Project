//34. Program to find the reverse of a number  Two constructors, one for calculation reverse and other for display “Finding reverse…”
// Argument variable and instance variable should be same  Main method allows to invoke only one constructor 


package assignment1;

public class ThisExample {
	int number;

	public ThisExample(int number) {
		this();
		this.number=number;
		int reverse = 0;
		while(number>0) {
			reverse =(reverse*10)+ (number%10);
			number = number/10;
		}
		System.out.println("reverse of the number: "+this.number +" is "+reverse);
		
	}

	public ThisExample() {
		System.out.println("Finding reverse");
	}

	public static void main(String[] args) {
		ThisExample rev = new ThisExample(235);
		
	}

}
