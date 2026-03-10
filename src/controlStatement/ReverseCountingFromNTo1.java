package controlStatement;

import java.util.Scanner;

public class ReverseCountingFromNTo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a value of n : ");
		int  n = sc.nextInt();
		while(n>=1) {
			System.out.println(n);
			n--;
		}
		sc.close();

	}

}
