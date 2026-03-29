package methodOverloding;

import java.util.Scanner;

class Area{
	public int areaFind(int side) {
		return (side*side);
	}
	
	public int areaFind(int length, int breadth) {
		return (length*breadth);
	}
	
	public double areaFind(double radius) {
		return (Math.PI*radius*radius);
	}
}

public class AreaCalculation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("MENU");
		System.out.println("Enter 1 to find area of square");
		System.out.println("Enter 2 to find area of rectangle");
		System.out.println("Enter 3 to find area of circle");
		System.out.println("-------------------------------------------------------");
		System.out.println("Enter your choice: ");
		int ch = sc.nextInt();
		Area ob = new Area();
		
		switch (ch) {
		case 1: {
			System.out.println("Enter the value of Side: ");
			int side=sc.nextInt();
			System.out.println("Area of the Square is:"+ob.areaFind(side));
			break;
		}
		case 2: {
			System.out.println("Enter the value of length and Breadth: ");
			int l=sc.nextInt();
			int b=sc.nextInt();
			System.out.println("Area of Rectangle is :"+ob.areaFind(l, b));
			break;
		}
		case 3: {
			System.out.println("Enter the value of Radius: ");
			Double r=sc.nextDouble();
			System.out.println("Area of Circle is :"+ob.areaFind(r));
			break;
		}
		default:
			System.out.println("Invalid choice......");
		}
		sc.close();
	}
}
