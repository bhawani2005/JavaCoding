package array58Program;

import java.util.Scanner;

public class SumOfArrayElements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Array Of Size: ");
		int size = sc.nextInt();
		
		int []arr = new int[size];
		System.out.println("Enter Array Elements : ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int sum = 0;
		
		for(int a : arr) {
			sum+=a;
		}
		
		System.out.println("Sum of Array Elements Is : "+sum);
		sc.close();
	}
}
