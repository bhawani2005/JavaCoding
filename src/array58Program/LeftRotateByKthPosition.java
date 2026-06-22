package array58Program;

import java.util.Arrays;
import java.util.Scanner;

public class LeftRotateByKthPosition {
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
		
		System.out.println(Arrays.toString(leftRotateByKthPosition(arr, k)));
		sc.close();
		
	}
	
	public static int[] leftRotateByKthPosition(int []arr, int k) {
		for(int i=1; i<=k; i++) {
			int temp=arr[0];
			for(int j=0; j<arr.length-1; j++) {
				arr[j] = arr[j+1];
			}
			arr[arr.length-1] = temp;
		}
		
		return arr;
	}
}
