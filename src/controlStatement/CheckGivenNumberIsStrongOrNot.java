package controlStatement;

import java.util.Scanner;

public class CheckGivenNumberIsStrongOrNot {
	
	public static int findFactorial(int num) {
		if(num==0) {
			return 1;
		}
		else {
			int i = 1;
			int fact = 1;
			while(i<=num) {
				fact *=i;
				i++;
			}
			return fact;
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		int temp = num;
		int sum=0;
		while(num!=0) {
			int ld = num%10;
			sum += findFactorial(ld);
			num /= 10;
		}
		if(sum == temp) {
			System.out.println(temp+" is a strong number.");
		}
		else {
			System.out.println(temp+" is not strong number.");
		}
		sc.close();
	}

}
