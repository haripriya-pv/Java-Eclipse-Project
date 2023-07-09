package assignment1;

public class TestResult extends AddClass{
	int r;

	public TestResult() {
		r=super.add();
		checkDivisibility();
	}

	public void checkDivisibility() {
		if(r%10==0) {
			System.out.println(""+r+" is divisible by 10");
		}
		else
			System.out.println(""+r+" is not divisible by 10");
		
	}

	public static void main(String[] args) {
		TestResult tr = new TestResult();
		
	}
	

}
