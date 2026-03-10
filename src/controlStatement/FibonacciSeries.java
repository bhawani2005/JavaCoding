package controlStatement;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a range : ");
		int count = sc.nextInt();
		int a=0;
		int b=1;
		int sum=0;
		int i=1;
		while(i<=count) {
			a=b;
			b=sum;
			sum=a+b;
			System.out.println(sum);
			i++;
		}
		sc.close();
	}

}
