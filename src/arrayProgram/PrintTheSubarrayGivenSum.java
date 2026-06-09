package arrayProgram;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintTheSubarrayGivenSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);    
		
		System.out.println("Enter array Size: ");
		int size = sc.nextInt();
		
		System.out.println("Enter array Elements: ");
		int []arr = new int [size];
		
		for(int i = 0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		printSubarrayByGivenTarget(arr, 15);
		sc.close();
	}
	
	public static void printSubarrayByGivenTarget(int[]arr, int target) {
		for(int i=0; i<arr.length; i++) {
			for(int j=i; j<arr.length; j++) {
				int sum1=0;
				ArrayList<Integer> subarray = new ArrayList<Integer>();
				System.out.print("");
				for(int k = i; k<=j; k++) {
					subarray.add(arr[k]);
					sum1+=arr[k];
				}
				if(sum1==target) {
					System.out.println(subarray);
				}
			}
		}
	}
}
