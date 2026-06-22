package array58Program;

import java.util.Scanner;

public class LargestElementInTheArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Array Of Size: ");
		int size = sc.nextInt();
		
		int []arr = new int[size];
		System.out.println("Enter Array Elements : ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int max = Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		
		System.out.println("Lergest Number In Array Is : "+max);
		sc.close();
	}
}
