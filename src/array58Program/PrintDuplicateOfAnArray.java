package array58Program;

import java.util.Scanner;

public class PrintDuplicateOfAnArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Array Of Size: ");
		int size = sc.nextInt();
		
		int []arr = new int[size];
		System.out.println("Enter Array Elements : ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		printDuplicate(arr);
		sc.close();
		
	}
	
	public static void printDuplicate(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			int count =0; 
			for(int j=i-1; j>=0; j--) {
				if(arr[i] == arr[j]) {
					count++;
				}
			}
			if(count==0) {
				int count1=0;
				for(int j=i; j<arr.length; j++) {
					if(arr[i] == arr[j]) {
						count1++;
					}
				}
				if(count1>1) {
					System.out.println(arr[i]);
				}
			}
		}
	}
}
