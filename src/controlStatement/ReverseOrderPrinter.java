package controlStatement;

import java.util.Scanner;

public class ReverseOrderPrinter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		for(int i=num; i>=1; i--) {
			if(i%3!=0) {
				System.out.println(i);
			}
		}
		sc.close();
	}

}
