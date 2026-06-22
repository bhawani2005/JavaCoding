package array58Program;

import java.util.Arrays;
import java.util.Scanner;

public class InsertElementAtGivenIndexInArray {
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
		
		System.out.println("Exter an index Where you insert the element: ");
		int index = sc.nextInt();
		
		System.out.println("Final Array Is : "+Arrays.toString(insertElementAtGivenIndex(arr, element, index)));
		sc.close();
	}
	
	public static int[] insertElementAtGivenIndex(int []arr, int element, int index) {
		int []ans = new int[arr.length+1];
		
		for(int i=0; i<ans.length; i++) {
			if(index>i) {
				ans[i] = arr[i];
			}
			else if(index == i) {
				ans[i] = element;
			}
			else{
				ans[i] = arr[i-1];
			}
		}		
		return ans;
	}
}
