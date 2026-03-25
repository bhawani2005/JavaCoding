package precticsQuestion;

import java.util.Scanner;

public class MQsn6 {
	public void printReverse(int num) {
		int rev = 0;
		while(num!=0) {
			rev = (rev*10)+(num%10);
			num/=10;
		}
		System.out.println(rev);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		MQsn6 ob = new MQsn6();
		ob.printReverse(num);
		sc.close();
	}
}
