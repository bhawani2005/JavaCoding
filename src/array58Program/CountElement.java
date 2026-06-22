package array58Program;

import java.util.Scanner;

public class CountElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Array Of Size: ");
		int size = sc.nextInt();
		
		int []arr = new int[size];
		System.out.println("Enter Array Elements : ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter an Element to be count: ");
		int num = sc.nextInt();
		
		System.out.println("Number "+num+" is "+countElement(arr, num)+" Times present In an array");
		sc.close();
	}
	
	public static int countElement(int []arr, int element) {
		int count=0;
		for(int a : arr) {
			if(a == element) {
				count++;
			}
		}
		
		return count;
	}
}
