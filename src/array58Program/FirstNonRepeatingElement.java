package array58Program;

import java.util.Scanner;

public class FirstNonRepeatingElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Array Of Size: ");
		int size = sc.nextInt();
		
		int []arr = new int[size];
		System.out.println("Enter Array Elements : ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		
		System.out.println(firstNonRepeatingElement(arr));
		sc.close();
		
		
	}
	
	public static int firstNonRepeatingElement(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			int count = 0;
			for(int j=0; j<arr.length; j++) {
				if(arr[i] == arr[j]) {
					count++;
				}
			}
			if(count == 1) {
				return arr[i];
			}
		}
		
		return -1;
	}
}
