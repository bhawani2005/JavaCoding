package assignmentQuestionOnMethod;

import java.util.Scanner;

public class Qsn25 {
	public static int factorial(int num) {
		int fact = 1;
		for(int i=1; i<=num; i++) {
			fact *= i;
		}
		
		return fact;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		System.out.println("The factorial of "+n+" is : "+factorial(n));
		sc.close();
	}
}
