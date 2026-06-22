package array58Program;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseAnArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Array Of Size: ");
		int size = sc.nextInt();
		
		int []arr = new int[size];
		System.out.println("Enter Array Elements : ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Reverse Array Is : "+Arrays.toString(reverseArray(arr)));
		sc.close();
	}
	
	public static int[] reverseArray(int arr[]) {
		int i=0, j=arr.length-1;
		
		while(i<j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			
			i++;
			j--;
		}
		
		return arr;
	}
}
