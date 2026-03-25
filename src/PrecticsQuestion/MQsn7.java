package precticsQuestion;

import java.util.Scanner;

public class MQsn7 {
	public void printCharacter(char ch, int n) {
		for(int i = 1; i<=n; i++) {
			System.out.print(ch);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character and Number: ");
		char ch = sc.next().charAt(0);
		int num = sc.nextInt();
		MQsn7 ob = new MQsn7();
		ob.printCharacter(ch, num);
		sc.close();
	}
}
