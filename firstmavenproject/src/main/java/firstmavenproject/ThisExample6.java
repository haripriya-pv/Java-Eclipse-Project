//this keyword can be used to return current class instance

package firstmavenproject;

public class ThisExample6 {

	public static void main(String[] args) {
		ThisExample6 obj = new ThisExample6();
		System.out.println(obj);
		obj.get().message() ;
		

	}

	public void message() {
		System.out.println("returned using this keyword");
		System.out.println(this);	
	}

	public ThisExample6 get() {
		
		return this;
	}

}
