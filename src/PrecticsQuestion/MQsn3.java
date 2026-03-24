package precticsQuestion;

import java.util.Scanner;

public class MQsn3 {
	public int multiply(int a, int b) {
		return (a*b);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter two Number : ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		MQsn3 ob = new MQsn3();
		System.out.println(ob.multiply(n1, n2));
		sc.close();
	}
}
