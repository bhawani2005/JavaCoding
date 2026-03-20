package method;

import java.util.Scanner;

public class ReturnLargestNumber {
	public static void main(String[] args) {
		System.out.println(findLargest());
	}
	
	public static int findLargest() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three Number : ");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		
		sc.close();
		
		return ((n1>n2)? ((n1>n3)? n1:n3):((n2>n3)? n2:n3));
	}
}
