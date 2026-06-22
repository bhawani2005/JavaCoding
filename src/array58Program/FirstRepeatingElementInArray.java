package array58Program;

import java.util.Scanner;

public class FirstRepeatingElementInArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Array Of Size: ");
		int size = sc.nextInt();
		
		int []arr = new int[size];
		System.out.println("Enter Array Elements : ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		
		System.out.println(firstRepeatingElement(arr));
		sc.close();
		
		
	}
	
	public static int firstRepeatingElement(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] == arr[j]) {
					return arr[j];
				}
			}
		}
		
		return -1;
	}
}
