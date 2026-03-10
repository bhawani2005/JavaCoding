package controlStatement;

import java.util.Scanner;

public class SumOfFirstNEvenNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of n : ");
		int n = sc.nextInt();
		int sum = 0;
		for(int i=1; i<=n*2; i++) {
			if(i%2==0) {
				sum=sum+i;
			}
		}
		System.out.print("Sum of "+n+" Even Number is :"+sum);
		sc.close();
	}

}
