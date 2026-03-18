package method;

import java.util.Scanner;

public class SumOfGivenTwoNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		sum(n1, n2);
		sc.close();
	}
	
	public static void sum(int n1, int n2) {
		int sum = n1+n2;
		System.out.println("The sum of two number is : "+sum);
	}
}
