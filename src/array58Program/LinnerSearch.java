package array58Program;

import java.util.Scanner;


public class LinnerSearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Array Of Size: ");
		int size = sc.nextInt();
		
		int []arr = new int[size];
		System.out.println("Enter Array Elements : ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter an Element to be search: ");
		int num = sc.nextInt();
		
		System.out.println("Element Present in index : "+linnerSearch(arr, num));
		sc.close();
	}
	
	public static int linnerSearch(int []arr, int num) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == num) {
				return i;
			}
		}
		
		return -1;
	}
}
