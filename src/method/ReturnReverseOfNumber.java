package method;

import java.util.Scanner;

public class ReturnReverseOfNumber {
	public static void main(String[] args) {
		int rev = reverseNumber();
		System.out.println(rev);
	}
	
	public static int reverseNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int temp = n;
		int rev = 0;
		while(temp!=0) {
			int ld = temp%10;
			rev = (rev*10)+ld;
			temp /= 10;
		}
		sc.close();
		return rev;
	}
}
