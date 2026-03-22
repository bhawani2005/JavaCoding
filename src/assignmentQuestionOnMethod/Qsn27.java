package assignmentQuestionOnMethod;

import java.util.Scanner;

public class Qsn27 {
	public static boolean checkPalindrome(int n) {
		int rev=0, temp=n;
		while(temp!=0) {
			rev = (rev*10)+(temp%10);
			temp/=10;
		}
		return rev==n;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		System.out.println(checkPalindrome(n));
		sc.close();
	}
}
