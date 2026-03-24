package precticsQuestion;

import java.util.Scanner;

public class MQsn1 {
	
	public static void printWelcome() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Msg.:");
		String msg = sc.nextLine();
		System.out.print(msg);
		sc.close();
	}
	
	public static void main(String[] args) {
		printWelcome();
	}
}
