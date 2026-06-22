package array58Program;

import java.util.Arrays;
import java.util.Scanner;

public class InsertElementAtFirstInArray {
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
		
		System.out.println("Final Array Is : "+Arrays.toString(insertElementAtFirst(arr, element)));
		sc.close();
	}
	
	public static int[] insertElementAtFirst(int []arr, int element) {
		int []ans = new int[arr.length+1];
		
		int j=0;
		ans[j] = element;
		j++;
		
		for(; j<arr.length+1; j++) {
			ans[j] = arr[j-1];
		}
		
		return ans;
	}
}
