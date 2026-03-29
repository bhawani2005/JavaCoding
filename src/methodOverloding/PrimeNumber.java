package methodOverloding;

import java.util.Scanner;

class Prime{
	public boolean checkPrime(int n) {
		boolean flag = true;
		for(int i=2; i<=n/2; i++) {
			if(n%i==0) {
				flag = false;
				break;
			}
		}
		return flag;
	}
	
	public void checkPrime(int start, int end) {
		for(int i=start; i<=end; i++) {
			boolean flag = true;
			for(int j=2; j<=i/2; j++) {
				if(i%j==0) {
					flag = false;
					break;
				}
			}
			if(flag) {
				System.out.print(i);
			}
		}
	}
}

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("MENU");
		System.out.println("Enter 1 to check whether a number is prime");
		System.out.println("Enter 2 to print prime numbers in a given range");
		System.out.println("-------------------------------------------------------");
		System.out.println("Enter your choice: ");
		int ch = sc.nextInt();
		Prime ob = new Prime();
		
		switch (ch) {
		case 1: {
			System.out.println("Enter a number: ");
			int num=sc.nextInt();
			System.out.println(ob.checkPrime(num));
			break;
		}
		case 2: {
			System.out.println("Enter start value: ");
			int s=sc.nextInt();
			System.out.println("Enter end value: ");
			int e=sc.nextInt();
			ob.checkPrime(s, e);
			break;
		}
		default:
			System.out.println("Invalid choice......");
		}
		sc.close();
	}
}
