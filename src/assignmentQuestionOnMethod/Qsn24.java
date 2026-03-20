package assignmentQuestionOnMethod;

import java.util.Scanner;

public class Qsn24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number : ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		System.out.println("Sum of two number : "+sum(n1, n2));
		sc.close();
	}
	
	public static int sum(int n1, int n2) {
		return (n1+n2);
	}
}
