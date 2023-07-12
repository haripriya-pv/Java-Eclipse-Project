package aggregation;

public class Employees {
	int id;
	String name;
	Address address; //aggregating Address class

	public Employees(int id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public static void main(String[] args) {
		Address ads = new Address("Alnadha", "UAE", "Dubai", 1101);
		Employees emp = new Employees(10, "Hari", ads);
        emp.display();
	}

	public void display() {
		System.out.println(".............Address............");
		System.out.println("......id "+id);
		System.out.println("......name "+name);
		System.out.println("......city "+address.city);
		System.out.println("......country "+address.country);
		System.out.println("......state "+address.state);
		System.out.println("......zip "+address.zip);
		
	}

}
