package array58Program;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElementFromLastInArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Array Of Size: ");
		int size = sc.nextInt();
		
		int []arr = new int[size];
		System.out.println("Enter Array Elements : ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		
		System.out.println("Final Array Is : "+Arrays.toString(DeleteElementFromLast(arr)));
		sc.close();
	}
	
	public static int[] DeleteElementFromLast(int []arr) {
		int []ans = new int[arr.length-1];
		
		for(int i = 0; i<ans.length; i++) {
			ans[i] = arr[i];
		}
		
		
		return ans;
	}
}
