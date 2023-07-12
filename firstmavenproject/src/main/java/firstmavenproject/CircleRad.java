
package firstmavenproject;

public class CircleRad {
	double radious;
	double area;

	public CircleRad() {
		radious=1;
	}

	public CircleRad(double radious) {
		this.radious = radious;
		this.area = 3.14*radious*radious;
	}

	public static void main(String[] args) {
		CircleRad circle1 = new CircleRad(10.0);
		CircleRad circle2 = new CircleRad(11);
		CircleRad circle3 = new CircleRad(10.5);
        double area=circle1.area();
        System.out.println("return area of circle 1 is "+area);
        circle2.display();
	}

	private void display() {
		System.out.println("radious: "+radious+"  area: "+area);
		
	}

	private double area() {
		return area;
		
	}

}
