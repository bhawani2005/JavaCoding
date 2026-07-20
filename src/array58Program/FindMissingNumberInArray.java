package array58Program;

import java.util.Scanner;

public class FindMissingNumberInArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Array Of Size: ");
		int size = sc.nextInt();
		
		int []arr = new int[size];
		System.out.println("Enter Array Elements : ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("The missing number is : "+findMissing(arr));
		sc.close();
	}
	
	public static int findMissing(int arr[]) {
		int n = arr.length;
		int sum = n*(n+1)/2;
		
		for(int a : arr) {
			sum -= a;
		}
		
		return sum;
	}
}
