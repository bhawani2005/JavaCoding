package methodOverloding;

import java.util.Scanner;

public class StudentMarksCalculator {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your markes : ");
		int m1 = sc.nextInt();
		int m2 = sc.nextInt();
		int m3 = sc.nextInt();
		System.out.println("Sum of mark 2 marks: "+Student.calculateMarks(m1, m2));
		Student ob = new Student();
		System.out.println("Average of 3 marks: "+ob.calculateMarks(m1, m2, m3));
		sc.close();
	}
}

class Student{
	public static int calculateMarks(int m1, int m2) {
		return (m1+m2);
	}
	
	public int calculateMarks(int m1, int m2, int m3) {
		return ((m1+m2+m3)/3);
	}
}
