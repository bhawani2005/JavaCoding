package arrayProgram;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseOfAArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter array Size: ");
		int size = sc.nextInt();
		
		System.out.println("Enter array Elements: ");
		int []arr = new int [size];
		
		for(int i = 0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		//======================================================
		
		int left=0; 
		int right = arr.length-1;
		
		while(left<right) {
			arr[left] = arr[left] ^ arr[right];
			arr[right] = arr[left] ^ arr[right];
			arr[left] = arr[left] ^ arr[right];
			
			left++;
			right--;
		}
		
		System.out.println("Reverse Array is "+Arrays.toString(arr));
	}
}
