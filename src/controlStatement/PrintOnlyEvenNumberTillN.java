package controlStatement;

import java.util.Scanner;

public class PrintOnlyEvenNumberTillN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a value of n : ");
		int  n = sc.nextInt();
		int i=1;
		while(i<=n) {
			if(i%2==0) {
				System.out.println(i);
			}
			i++;
		}
		sc.close();

	}

}
