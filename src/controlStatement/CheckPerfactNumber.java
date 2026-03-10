package controlStatement;

import java.util.Scanner;

public class CheckPerfactNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		int sum = 0;
		int i = 1;
		while(i<num) {
			if(num%i==0) {
				sum+=i;
			}
			i++;
		}
		if(num == sum) {
			System.out.println("It is perfact number.");
		}
		else {
			System.out.println("It is not a perfact number.");
		}
		sc.close();
	}

}
