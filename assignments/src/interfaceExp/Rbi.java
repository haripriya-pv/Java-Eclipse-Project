// 41. Write a program, where RBI will be an interface, have a method recurringDeposit which can accept the amount and duration. 
//This must be implemented in class HDFC.  When a customer deposit amount in HDFC, 
//they must be able to know how much amount they will get after depositing for n period of time.
// Interest rate is defined in RBI interface.


package interfaceExp;

public interface Rbi {
	double intrestRate = 0.1;
	void recurringDeposit(double a,int d);

}
