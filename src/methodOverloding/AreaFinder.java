package methodOverloding;

import java.util.Scanner;

class AreaCalculator{
	public static double findArea(double r) {
		return (Math.PI*r*r);
	}
	
	public double findArea(double l, double b) {
		return (l*b);
	}
}

public class AreaFinder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Radius of Circle: ");
		double r = sc.nextDouble();
		System.out.println("Area of Circle: "+AreaCalculator.findArea(r));
		System.out.println("Enter Length and Breadth: ");
		double l = sc.nextDouble();
		double b = sc.nextDouble();
		AreaCalculator ob = new AreaCalculator();
		System.out.print("Area of Rectangle: "+ob.findArea(l, b));
		sc.close();
		
	}
}
