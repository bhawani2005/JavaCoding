package assignmentQuestionOnMethod;

import java.util.Scanner;

public class Qsn9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int num1 = sc.nextInt();
		System.out.println("Enter the second Number : ");
		int num2 = sc.nextInt();
		sumOfNumber(num1, num2);
		sc.close();
	}
	
	public static void sumOfNumber(int n1, int n2) {
		System.out.println("Sum of the number is: "+(n1+n2));
	}
}
