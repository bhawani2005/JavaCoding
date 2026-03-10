package controlStatement;

import java.util.Scanner;

public class HcfOrGcdOfGiveTwoNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value of a : ");
		int num1 = sc.nextInt();
		System.out.println("Enter a value of b : ");
		int num2 = sc.nextInt();
		int i=1;
		int hcf=0;
		while(i<=num1 && i<=num2) {
			if((num1%i==0 && num2%i==0)) {
				hcf=i;
			}
			i++;
		}
		System.out.println("HCF is : "+hcf);
		sc.close();
	}
}
