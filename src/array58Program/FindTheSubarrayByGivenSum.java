package array58Program;

import java.util.ArrayList;
import java.util.Scanner;

public class FindTheSubarrayByGivenSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Array Of Size: ");
		int size = sc.nextInt();
		
		int []arr = new int[size];
		System.out.println("Enter Array Elements : ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter the target sum: ");
		int targetSum = sc.nextInt();
		findSubarrayByGivenSum(arr, targetSum);
		sc.close();
	}
	
	public static void findSubarrayByGivenSum(int arr[], int gSum) {
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i; j<arr.length; j++) {
				int sum = 0;
				ArrayList<Integer> subarray = new ArrayList<Integer>();
				for(int k=i; k<=j; k++) {
					sum += arr[k];
					subarray.add(arr[k]);
				}
				if(sum == gSum) {
					System.out.println(subarray);
					return;
				}
			}
		}
	}
}
