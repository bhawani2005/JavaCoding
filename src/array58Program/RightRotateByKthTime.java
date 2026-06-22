package array58Program;

import java.util.Arrays;
import java.util.Scanner;

public class RightRotateByKthTime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Array Of Size: ");
		int size = sc.nextInt();
		
		int []arr = new int[size];
		System.out.println("Enter Array Elements : ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter the kth value : ");
		int k = sc.nextInt();
		
		System.out.println(Arrays.toString(rightRotateByKthPosition(arr, k)));
		sc.close();
		
	}
	
	public static int[] rightRotateByKthPosition(int []arr, int k) {
		for(int i=1; i<=k; i++) {
			int temp=arr[arr.length-1];
			for(int j=arr.length-1; j>0; j--) {
				arr[j] = arr[j-1];
			}
			arr[0] = temp;
		}
		
		return arr;
	}
}
