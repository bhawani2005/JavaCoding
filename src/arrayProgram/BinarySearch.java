package arrayProgram;

import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter array Size: ");
		int size = sc.nextInt();
		
		System.out.println("Enter array Elements: ");
		int []arr = new int [size];
		
		for(int i = 0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter the value of target: ");
		int target = sc.nextInt();
		
		if(binarySearch(arr, target)>=0) {
			System.out.println(target+" is preasent in index number "+binarySearch(arr, target));
		}
		else {
			System.out.println("Target is not there..");
		}
		
		sc.close();
		
	}
	
	public static int binarySearch(int arr[], int target) {
		int left = 0, right=arr.length-1;
		
		while(left<=right) {
			int mid = (left+right)/2;
			if(arr[mid]==target) {
				return mid;
			}
			else if(arr[mid]<target) {
				left = mid+1;
			}
			else {
				right = mid-1;
			}
		}
		return -1;
	}
}

