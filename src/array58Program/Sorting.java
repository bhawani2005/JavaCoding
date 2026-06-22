package array58Program;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Array Of Size: ");
		int size = sc.nextInt();
		
		int []arr = new int[size];
		System.out.println("Enter Array Elements : ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(Arrays.toString(insertionSort(arr)));
		
		sc.close();
	}
	
	public static int[] bubbleSort(int arr[]) {
		for(int cycle = 1; cycle<arr.length-1; cycle++) {
			for(int i=0; i<arr.length-1-cycle; i++) {
				if(arr[i] > arr[i+1]) {
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
		}
		return arr;
	}
	
	
	public static int[] selectionSort(int arr[]) {
		for(int i=0; i<arr.length-1; i++) {
			int min = Integer.MAX_VALUE;
			int minIndex = i;
			for(int j=i+1; j<arr.length; j++) {
				if(min>arr[j]) {
					min = arr[j];
					minIndex = j;
				}
			}
			if(arr[i]>min) {
				arr[minIndex] = arr[i];
				arr[i] = min;
			}
		}
		return arr;
	}
	
	public static int[] insertionSort(int arr[]) {
		for(int i=1; i<arr.length; i++) {
			int key = arr[i];
			int j = i-1;
			
			while(j>=0 && arr[j]>key) {
				arr[j+1] = arr[j];
				j--;
			}
			
			arr[j+1] = key;
		}
		
		return arr;
		
	}
}
