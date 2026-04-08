package methodOverloding;

import java.util.Scanner;

class Palindrome{
	public boolean checkPalindrom(int n) {
		int temp = n, rev=0;
		while(temp!=0) {
			rev = (rev*10)+(temp%10);
			temp/=10;
		}
		return n==rev;
	}
	
	public void checkPalindrom(int start, int end) {
		for(int i=start; i<=end; i++) {
			int temp = i, rev=0;
			while(temp!=0) {
				rev = (rev*10)+(temp%10);
				temp/=10;
			}
			if(i==rev) {
				System.out.println(i);
			}
		}
	}
}

public class PalindromeNumberProgram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("MENU");
		System.out.println("Enter 1 to check whether a number is palindrome");
		System.out.println("Enter 2 to print palindrome numbers in a range");
		System.out.println("-------------------------------------------------------");
		System.out.println("Enter your choice: ");
		int ch = sc.nextInt();
		Palindrome ob = new Palindrome();
		
		switch (ch) {
		case 1: {
			System.out.println("Enter a number: ");
			int num=sc.nextInt();
			System.out.println(ob.checkPalindrom(num));
			break;
		}
		case 2: {
			System.out.println("Enter start value: ");
			int s=sc.nextInt();
			System.out.println("Enter end value: ");
			int e=sc.nextInt();
			ob.checkPalindrom(s, e);;
			break;
		}
		default:
			System.out.println("Invalid choice......");
		}
		sc.close();
	}
}
