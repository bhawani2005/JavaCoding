package controlStatement;

import java.util.Scanner;

public class SumOfMultiples {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of limit : ");
		int limit = sc.nextInt();
		System.out.print("Enter the value of divisor : ");
		int divisor = sc.nextInt();
		int sum=0;
		for(int i=1; i<=limit; i++) {
			if(i%divisor == 0) {
				sum += i;
			}
		}
		System.out.println("Sum : "+sum);
		sc.close();
	}

}
