package array58Program;

import java.util.Scanner;

public class FindLeaderInArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Array Of Size: ");
		int size = sc.nextInt();
		
		int []arr = new int[size];
		System.out.println("Enter Array Elements : ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		
		printLeader(arr);
		sc.close();
	}
	
	public static void printLeader(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			boolean isLeader = true;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] < arr[j]) {
					isLeader = false;
					break;
				}
			}
			
			if(isLeader == true) {
				System.out.println(arr[i]);
			}
		}
	}
}
