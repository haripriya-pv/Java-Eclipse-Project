package assignment1;

public class TotalSalary extends HraCalc{
	double totalSalary;
	public void getTotalSalary() {
		totalSalary =basicPay+hra-pf-deduction+bonus;
	}
	
	public void getSalarySlip() {
		System.out.println("...............Salary Slip...............");
		System.out.println("......Basic Pay = " +basicPay +"...............");
		System.out.println("......Deduction Amount = "+deduction +"..........");
		System.out.println("......Bonus = " +bonus+"....................");
		System.out.println("......HRA = " +hra+"......................");
		System.out.println("......PF = " +pf+".......................");
		System.out.println("......Total Salary = " +totalSalary+"............");
		System.out.println(".........................................");
	}

}
