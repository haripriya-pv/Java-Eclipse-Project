package aggregation;

public class Circle {
	Operation op;//aggregation  
	double pi=3.14;

	public static void main(String[] args) {
		
		Circle c = new Circle();
		double result = c.area(10);
		System.out.println("area of circle = "+result);

	}

	public double area(int r) {
		//Operation obj = new Operation();
		op = new Operation();
		 int rsquare=op.square(r);//code reusability (i.e. delegates the method call). 
		 return pi*rsquare;  
		
	}

}
