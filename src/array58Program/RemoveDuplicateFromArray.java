package array58Program;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicateFromArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Array Of Size: ");
		int size = sc.nextInt();
		
		int []arr = new int[size];
		System.out.println("Enter Array Elements : ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		
		System.out.println((removeDuplicate(arr)));
		sc.close();
		
	}
	
	public static ArrayList<Integer> removeDuplicate(int arr[]) {
		ArrayList<Integer> ans = new ArrayList<>();
		
		for(int i=0; i<arr.length; i++) {
			int count=0;
			for(int j=i-1; j>=0; j--) {
				if(arr[i] == arr[j]) {
					count++;
				}
			}
			if(count==0) {
				ans.add(arr[i]);
			}
		}
		
		return ans;
	}
}
