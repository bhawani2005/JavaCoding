package array58Program;

import java.util.Scanner;

public class BinarySearchInArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Array Of Size: ");
		int size = sc.nextInt();
		
		int []arr = new int[size];
		System.out.println("Enter Array Elements : ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter an Element To be search: ");
		int element = sc.nextInt();
		
		System.out.println(binarySearch(arr, element));
		sc.close();
		
		
	}
	
	public static int binarySearch(int arr[], int element) {
		int left=0; 
		int right = arr.length-1;
		
		while(left<=right) {
			int mid = (left+right)/2;
			if(arr[mid] == element) {
				return mid;
			}
			else if(arr[mid]>element) {
				right = mid-1;
			}
			else {
				left = mid+1;
			}
		}
		return -1;
	}
}
