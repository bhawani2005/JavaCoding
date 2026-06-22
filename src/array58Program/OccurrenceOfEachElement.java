package array58Program;

import java.util.Scanner;

public class OccurrenceOfEachElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Array Of Size: ");
		int size = sc.nextInt();
		
		int []arr = new int[size];
		System.out.println("Enter Array Elements : ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		occurrenceOfEachElement(arr);
		sc.close();
	}
	
	public static void occurrenceOfEachElement(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			int reverseCount=0;
			for(int j=i-1; j>=0; j--) {
				if(arr[i] == arr[j]) {
					reverseCount++;
					break;
				}
			}
			if(reverseCount == 0) {
				int count = 0;
				for(int a = i; a<arr.length; a++) {
					if(arr[i] == arr[a]) {
						count++;
					}
				}
				System.out.println(arr[i]+" is present "+count+" times.");
			}
		}
	}
}
