package controlStatement;

import java.util.Scanner;

public class SumOfTheDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		int sum = 0;
		while(num!=0) {
			int ld = num%10;
			sum = sum+ld;
			num = num/10;
			
		}
		System.out.println("Sum of digits is : "+sum);
		sc.close();
	}

}
