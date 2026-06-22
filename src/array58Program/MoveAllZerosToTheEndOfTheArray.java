package array58Program;

import java.util.Arrays;
import java.util.Scanner;

public class MoveAllZerosToTheEndOfTheArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Array Of Size: ");
		int size = sc.nextInt();
		
		int []arr = new int[size];
		System.out.println("Enter Array Elements : ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		
		System.out.println(Arrays.toString(moveZerosToLast(arr)));
		sc.close();
		
	}
	
	public static int[] moveZerosToLast(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == 0) {
				int temp = arr[i];
				for(int j=i; j<arr.length-1; j++) {
					arr[j] = arr[j+1];
				}
				arr[arr.length-1] = temp;
			}
		}
		return arr;
	}
}
