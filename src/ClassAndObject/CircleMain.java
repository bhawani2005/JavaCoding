package classAndObject;

public class CircleMain {
	public static void main(String[] args) {
		Circle c1 = new Circle();
		c1.radius=25.236;
		c1.displayCircleInfo();
	}
}


class Circle{
	double radius;
	
	public double calculateArea() {
		return (Math.PI*radius*radius);
	}
	
	public double calculateCircumference() {
		return (2*Math.PI*radius);
	}
	
	public void displayCircleInfo() {
		System.out.println("Radius of Circle: "+radius);
		System.out.println("Area of Circle: "+calculateArea());
		System.out.println("Circumference of Circle: "+calculateCircumference());
	}
}