package precticsQuestion;

import java.util.Scanner;

public class MQsn8 {
	public void displayResult(int marks) {
		if(marks>=35) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a your marks: ");
		int marks = sc.nextInt();
		MQsn8 ob = new MQsn8();
		ob.displayResult(marks);
		sc.close();
	}
}
