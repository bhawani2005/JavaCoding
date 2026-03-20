package method;

import java.util.Scanner;

public class ReturnSumOfDigit {
	public static void main(String[] args) {
		int sum=sumOfDigit();
		System.out.println("Sum of Two Digit : "+sum);
	}
	
	public static int sumOfDigit() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first Numebr:");
		int n1 = sc.nextInt();
		System.out.println("Enter the Second number : ");
		int n2 = sc.nextInt();
		
		sc.close();
		
		return (n1+n2);
	}
}
