package precticsQuestion;

import java.util.Scanner;

public class MQsn4 {
	
	public boolean isPalindrome(int num) {
		int temp=num, rev=0;
		while(temp!=0) {
			rev = (rev*10)+(temp%10);
			temp/=10;
		}
		if(rev == num) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		MQsn4 ob = new MQsn4();
		System.out.print(ob.isPalindrome(num));
		sc.close();
	}
}
