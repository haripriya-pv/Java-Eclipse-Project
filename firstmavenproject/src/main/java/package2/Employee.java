package package2;

public class Employee {
	int basicSalary =10000;

	public static void main(String[] args) {
		Employee obj = new Employee();
		System.out.println(obj.basicSalary);
		obj.display();

	}

	public void display() {
		System.out.println("parent class method");
		
	}
	

}
