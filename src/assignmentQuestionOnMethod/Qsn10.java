package assignmentQuestionOnMethod;

import java.util.Scanner;

public class Qsn10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		squareOfThisNumber(num);
		sc.close();
	}
	
	public static void squareOfThisNumber(int n) {
		System.out.println("Square of a number :"+(n*n));
	}
}
