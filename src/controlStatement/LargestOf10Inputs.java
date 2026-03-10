package controlStatement;

import java.util.Scanner;

public class LargestOf10Inputs {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 10 Number : ");
		int largest = Integer.MIN_VALUE;
		for(int i = 1; i<=10; i++) {
			int num = sc.nextInt();
			if(num>largest) {
				largest = num;
			}
		}
		System.out.print("out of 10 Largest number is : "+largest);
		sc.close();
	}
}
