package array58Program;

import java.util.Scanner;

public class ProductOfOddElements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Array Of Size: ");
		int size = sc.nextInt();
		
		int []arr = new int[size];
		System.out.println("Enter Array Elements : ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int product = 1;
		
		for(int a : arr) {
			if(a%2 != 0) {
				product*=a;
			}
		}
		
		System.out.println("Sum of Array Elements Is : "+product);
		sc.close();
	}
}
