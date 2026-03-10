package controlStatement;

import java.util.Scanner;

public class CheckSpyNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value : ");
		int num = sc.nextInt();
		int sum=0;
		int product=1;
		while(num!=0) {
			int ld = num%10;
			
			sum = sum+ld;
			product = product*ld;
			
			num=num/10;
		}
		if(sum == product) {
			System.out.println("Spy number.");
		}
		else {
			System.out.println("Not spy number.");
		}
		sc.close();
	}

}
