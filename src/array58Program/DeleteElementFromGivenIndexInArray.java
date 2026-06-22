package array58Program;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElementFromGivenIndexInArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Array Of Size: ");
		int size = sc.nextInt();
		
		int []arr = new int[size];
		System.out.println("Enter Array Elements : ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter an Index Where delete the Element: ");
		int index = sc.nextInt();
		
		System.out.println("Final Array Is : "+Arrays.toString(DeleteElementFromGivenIndex(arr, index)));
		sc.close();
	}
	
	public static int[] DeleteElementFromGivenIndex(int []arr, int index) {
		int []ans = new int[arr.length-1];
		
		for(int i = 0; i<ans.length; i++) {
			if(i<index) {
				ans[i] = arr[i];
			}
			else {
				ans[i] = arr[i+1];
			}
		}
		
		
		return ans;
	}
}
