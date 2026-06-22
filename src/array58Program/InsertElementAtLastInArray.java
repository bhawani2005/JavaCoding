package array58Program;

import java.util.Arrays;
import java.util.Scanner;

public class InsertElementAtLastInArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Array Of Size: ");
		int size = sc.nextInt();
		
		int []arr = new int[size];
		System.out.println("Enter Array Elements : ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		
		System.out.println("Enter an element : ");
		int element = sc.nextInt();
		
		System.out.println("Final Array Is : "+Arrays.toString(insertElementAtLast(arr, element)));
		sc.close();
	}
	
	public static int[] insertElementAtLast(int []arr, int element) {
		int []ans = new int[arr.length+1];
		
		for(int i = 0; i<arr.length; i++) {
			ans[i] = arr[i];
		}
		
		ans[arr.length] = element;
		
		return ans;
	}
}
