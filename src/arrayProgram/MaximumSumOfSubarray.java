package arrayProgram;

import java.util.Scanner;

public class MaximumSumOfSubarray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);    
		
		System.out.println("Enter array Size: ");
		int size = sc.nextInt();
		
		System.out.println("Enter array Elements: ");
		int []arr = new int [size];
		
		for(int i = 0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		maximumSumOfSubarray(arr);
		
	}
	
	public static void maximumSumOfSubarray(int[]arr) {
		int max = Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++) {
			for(int j=i; j<arr.length; j++) {
				int sum1=0;
				System.out.print("");
				for(int k = i; k<=j; k++) {
					System.out.print(arr[k]+" ");
					sum1+=arr[k];
				}
				max = Math.max(max, sum1);
				System.out.print(" = "+sum1);
				System.out.println();
			}
		}
		System.out.println("Maximum Sum of Subarray is : "+max);
	}
}
