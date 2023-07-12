package firstmavenproject;

public class ThisStudent {
	int rollNo;
	String name,course;
	float fee;

	public ThisStudent() {
		
	}
	

	public ThisStudent(int rollNo, String name, String course) {
		this.rollNo = rollNo;
		this.name = name;
		this.course = course;
	}
	


	public ThisStudent(int rollNo, String name, String course, float fee) {
		this(rollNo,name,course);   //constructor chaining or re-using constructor
		this.fee = fee;
		
	}


	public static void main(String[] args) {
		ThisStudent std1 = new ThisStudent(11,"Hari","Automation");
		ThisStudent std2 = new ThisStudent(11,"Hari","Automation",500);
        std1.display();
        std2.display();
	}


	public void display() {
		System.out.println("student details : "+rollNo+" "+name+" "+course+" "+fee);
		
	}

}
