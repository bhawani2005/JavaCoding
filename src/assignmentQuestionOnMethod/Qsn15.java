package assignmentQuestionOnMethod;

import java.util.Scanner;

public class Qsn15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		checkPrime(num);
		sc.close();
	}
	
	public static void checkPrime(int n) {
		boolean flag = true;
		int i=2;
		while(i<n/2) {
			if(n%i==0) {
				flag = false;
				break;
			}
		}
		if(flag) {
			System.out.println("Prime number");
		}
		else {
			System.out.println("Not A prime Number.");
		}
	}
}
