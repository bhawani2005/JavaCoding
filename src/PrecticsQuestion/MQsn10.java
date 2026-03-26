package precticsQuestion;

import java.util.Scanner;

public class MQsn10 {
	public boolean checkEvenOdd() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		sc.close();
		return (num%2==0);
	}
	public static void main(String[] args) {
		MQsn10 ob = new MQsn10();
		System.out.println(ob.checkEvenOdd());
	}
}