package assignmentQuestionOnMethod;

import java.util.Scanner;

public class Qsn16 {
	public static void printFibonacci(int n) {
		int a=0, b=1, sum=0;
		for(int i=1; i<=n; i++) {
			System.out.println(sum);
			a=b;
			b=sum;
			sum=a+b;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a range : ");
		int n = sc.nextInt();
		printFibonacci(n);
		sc.close();
	}
}
