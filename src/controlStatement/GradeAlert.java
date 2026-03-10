package controlStatement;

import java.util.Scanner;

public class GradeAlert {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your marks : ");
		int mark = sc.nextInt();
		if(mark>90) {
			System.out.println("Excellent!");
		}
		sc.close();
	}

}
