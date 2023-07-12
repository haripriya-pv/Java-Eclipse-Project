package firstmavenproject;

public class Counter {
	int count; //instance variable,will get memory each time when the instance is created  
	static int count2; //will get memory only once and retain its value,is shared with all objects.  

	public Counter() {
		count++;
		count2++;
		System.out.println("instance variable: "+count);
		System.out.println("static variable: "+count2);
	}

	public static void main(String[] args) {
		Counter obj1 = new Counter();
		Counter obj2 = new Counter();
		Counter obj3 = new Counter();

	}

}
