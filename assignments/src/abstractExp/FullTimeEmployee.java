package abstractExp;

public class FullTimeEmployee extends Employee{

	public static void main(String[] args) {
		FullTimeEmployee obj = new FullTimeEmployee();
		obj.calculateSalary();
		Contractor obj1 = new Contractor();
		obj1.calculateSalary();
		}

	@Override
	public void calculateSalary() {
		
		salaryPerHour = 500;
		totalSalary = fullTime*salaryPerHour;
		System.out.println("total per day salary of fulltime employee= "+totalSalary);
		
		
	}

}
