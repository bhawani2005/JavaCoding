package precticsQuestion;

import java.util.Scanner;

public class MQsn9 {
	public int getAge() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Age: ");
		int age = sc.nextInt();
		sc.close();
		return age;
	}
	public static void main(String[] args) {
		MQsn9 ob = new MQsn9();
		System.out.println("Your age is : "+(ob.getAge()));
	}
}
