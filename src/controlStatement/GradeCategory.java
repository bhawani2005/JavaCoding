package controlStatement;

import java.util.Scanner;

public class GradeCategory {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your marks : ");
		int marks = sc.nextInt();
		for(int i=1; i<=1; i++) {
			if(marks>=90) {
				System.out.println("A");
			}
			else if(marks<89 && marks>=75) {
				System.out.println("B");
			}
			else if(marks<=74 && marks>=50) {
				System.out.println("C");
			}
			else if(marks<50) {
				System.out.println("D");
			}
		}
		
		sc.close();

	}

}
