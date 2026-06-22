package array58Program;

import java.util.Scanner;

public class CountUniqueElementInArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Array Of Size: ");
		int size = sc.nextInt();
		
		int []arr = new int[size];
		System.out.println("Enter Array Elements : ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(countUnique(arr));
		sc.close();
	}
	
	public static int countUnique(int arr[]) {
		int uniqueCount=0;
		
		for(int i=0; i<arr.length; i++) {
			boolean isPrePresent = false;
			for(int j=i-1; j>=0; j--) {
				if(arr[i] == arr[j]) {
					isPrePresent = true;
					break;
				}
			}
			if(isPrePresent==false) {
				boolean isAfterPresent = false;
				for(int k=i+1; k<arr.length; k++) {
					if(arr[i] == arr[k]) {
						isAfterPresent = true;
						break;
					}
				}
				if(isAfterPresent == false) {
					uniqueCount++;
				}
			}
		}
		return uniqueCount;
	}
}
