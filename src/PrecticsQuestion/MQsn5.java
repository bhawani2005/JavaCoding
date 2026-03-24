package precticsQuestion;

import java.util.Scanner;

public class MQsn5 {
	public int findMin(int a, int b, int c) {
		return (a<b)? ((a<c)? a:c) : ((b<c)? b:c);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three number : ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		MQsn5 ob = new MQsn5();
		System.out.println(ob.findMin(n1, n2, n3));
		sc.close();
	} 
}
