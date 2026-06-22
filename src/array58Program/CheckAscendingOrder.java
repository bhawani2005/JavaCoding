package array58Program;

import java.util.Scanner;

public class CheckAscendingOrder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Array Of Size: ");
		int size = sc.nextInt();
		
		int []arr = new int[size];
		System.out.println("Enter Array Elements : ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("IsAscending? : "+checkAscending(arr));
		sc.close();
	}
	
	public static boolean checkAscending(int arr[]) {
		for(int i=1; i<arr.length; i++) {
			if(arr[i]<arr[i-1]) {
				return false;
			}
		}
		return true;
	}
}
