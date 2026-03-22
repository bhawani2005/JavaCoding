package assignmentQuestionOnMethod;

import java.util.Scanner;

public class Qsn12 {
	
	public static void factorial(int n) {
		int fact = 1;
		for(int i=1; i<=n; i++) {
			fact *= i;
		}
		System.out.println("Factorial of given number: "+fact);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		factorial(num);
		sc.close();
	}
}
