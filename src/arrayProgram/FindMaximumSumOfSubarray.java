package arrayProgram;

import java.util.ArrayList;
import java.util.Scanner;

public class FindMaximumSumOfSubarray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Array Of Size: ");
		int size = sc.nextInt();
		
		int []arr = new int[size];
		System.out.println("Enter Array Elements : ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		maximumSubarraySum(arr);
		sc.close();
	}
	
	public static void maximumSubarraySum(int arr[]) {
		int max = Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i; j<arr.length; j++) {
				int sum = 0;
				ArrayList<Integer> subarray = new ArrayList<Integer>();
				for(int k=i; k<=j; k++) {
					sum += arr[k];
					subarray.add(arr[k]);
				}
				
				System.out.println(subarray+" -> "+sum);
				max = (max<sum)? sum : max;
			}
		}
		
		System.out.println("Maximum Sum Of Subarray Is : "+max);
	}
}
