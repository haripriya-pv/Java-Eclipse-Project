package firstmavenproject;

public class ThisExample5Class2 {
	ThisExample5Class1 objclass1;

	public ThisExample5Class2(ThisExample5Class1 objclass1) {
		this.objclass1 = objclass1;
	}
    
	public void display() {
		System.out.println("displaying the value of fist class's instance object " +(objclass1.number));
	}
}
