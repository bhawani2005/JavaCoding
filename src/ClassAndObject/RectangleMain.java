package classAndObject;

public class RectangleMain {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		r1.length=50;
		r1.breadth=40;
		r1.displayDetails();
	}
}


class Rectangle{
	double length;
	double breadth;
	
	public double calculateArea() {
		return (length*breadth);
	}
	
	public double calculatePerimeter() {
		return (2*(length+breadth));
	}
	
	public void displayDetails() {
		System.out.println("Length of Rectangle: "+length);
		System.out.println("Breadth of Rectangle: "+breadth);
		System.out.println("Area of Rectangle: "+calculateArea());
		System.out.println("Perimeter of Rectangle: "+calculatePerimeter());
		
	}
}