package firstmavenproject;

import java.util.Scanner;

public class TestConstructor {
	 
	private String name;
	private int id;

	public TestConstructor() {
		
	}
public TestConstructor(String name,int id) {
	    //nam= nam;
	    //id1 = id1;
	    this.name =name;
	    this.id = id;
		System.out.println("Name : " +name +" "+ "id :" +id);
	}

	public static void main(String[] args) {
		System.out.println("enter your name and id");
		Scanner sc = new Scanner(System.in);
		TestConstructor obj = new TestConstructor();
		String name=sc.nextLine();
		int id = sc.nextInt();
		TestConstructor obj1 = new TestConstructor(name,id);
		TestConstructor obj2 = new TestConstructor("Priya",2);
      
	}

}
