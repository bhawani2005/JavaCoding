package method;

import java.util.Scanner;

public class PrintFactorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value of n: ");
		int n = sc.nextInt();
		sc.close();
		
		printFactotial(n);
	}
	
	public static void printFactotial(int n) {
		int a=0;
		int b=1;
		int sum = 0;
		int i=1;
		while(i<=n) {
			System.out.println(sum);
			a=b;
			b=sum;
			sum = a+b;
			i++;
		}
	}
}
