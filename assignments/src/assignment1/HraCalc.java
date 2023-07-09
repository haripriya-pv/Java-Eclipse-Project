package assignment1;

public class HraCalc extends Salary {
	double hra;
	double pf;
	public void getHra() {
		hra = (basicPay*5)/100;
	}
	
	public void getPF() {
		pf = (basicPay*20)/100;
	}

}
