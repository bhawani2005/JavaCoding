package assignmentQuestionOnMethod;

import java.util.Scanner;

public class Qsn13 {
	public static void reverseNumber(int n) {
		int rev=0;
		while(n!=0) {
			rev = (rev*10)+(n%10);
			n/=10;
		}
		System.out.println(rev);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		reverseNumber(num);
		sc.close();
	}
}
