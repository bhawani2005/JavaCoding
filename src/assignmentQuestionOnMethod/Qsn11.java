package assignmentQuestionOnMethod;

import java.util.Scanner;

public class Qsn11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = sc.nextInt();
		checkEvenOdd(num);
		sc.close();
	}
	
	public static void checkEvenOdd(int n) {
		if(n%2==0) {
			System.out.println("Even number");
		}
		else {
			System.out.println("Odd Number");
		}
	}
}
