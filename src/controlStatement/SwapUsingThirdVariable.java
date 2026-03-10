package controlStatement;

import java.util.Scanner;

public class SwapUsingThirdVariable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value of a : ");
		int a = sc.nextInt();
		System.out.println("Enter a value of b : ");
		int b = sc.nextInt();
		int c=a;
		a=b;
		b=c;
		System.out.println("Value of a: "+a);
		System.out.println("Value of b: "+b);
		sc.close();
	}

}
