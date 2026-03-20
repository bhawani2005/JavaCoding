package method;

import java.util.Scanner;

public class ReverseANumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		int rev = reverseNumber(num);
		System.out.println(rev);
		sc.close();
	}
	
	public static int reverseNumber(int num ) {
		int rev = 0;
		while(num!=0) {
			int ld = num%10;
			rev = (rev*10)+ld;
			num/=10;
		}
		return rev;
	}
}
