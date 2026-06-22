package array58Program;

import java.util.ArrayList;
import java.util.Scanner;

public class SumOfAllSubArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Array Of Size: ");
		int size = sc.nextInt();
		
		int []arr = new int[size];
		System.out.println("Enter Array Elements : ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sumOfAllSubArray(arr);
		sc.close();
	}
	
	public static void sumOfAllSubArray(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			for(int j=i; j<arr.length; j++) {
				int sum = 0;
				ArrayList<Integer> subarray = new ArrayList<Integer>();
				for(int k=i; k<=j; k++) {
					subarray.add(arr[k]);
					sum += arr[k];
				}
				System.out.println(subarray+" -> "+sum);
			}
		}
	}
}
