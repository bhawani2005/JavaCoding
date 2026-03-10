package interviewQuestionsFromNumberSystem;

import java.util.Scanner;

public class FactorialOfANumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		int fact=1;
		int i=1;
		while(i<=num) {
			fact*=i;
			i++;
		}
		System.out.println("Factorial of a number : "+fact);
		sc.close();
	}

}
