package array58Program;

import java.util.Scanner;

public class SmallestElementInTheArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Array Of Size: ");
		int size = sc.nextInt();
		
		int []arr = new int[size];
		System.out.println("Enter Array Elements : ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int min = Integer.MAX_VALUE;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		
		System.out.println("Lergest Number In Array Is : "+min);
		sc.close();
	}
}
