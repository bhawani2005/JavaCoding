package arrayProgram;

import java.util.Scanner;

public class CountUniqueElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);    
		
		System.out.println("Enter array Size: ");
		int size = sc.nextInt();
		
		System.out.println("Enter array Elements: ");
		int []arr = new int [size];
		
		for(int i = 0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("\nUnique Element Count : "+printAndCountUnique(arr));
		sc.close();
	}
	
	public static int printAndCountUnique(int arr[]) {
		int mainCount = 0;
		System.out.println("Unique Element is: ");
		for(int i=0; i<arr.length; i++) {
			int count=0;
			for(int j=0; j<arr.length; j++ ) {
				if(arr[i] == arr[j] && j!=i) {
					count++;
				}
			}
			if(count==0) {
				System.out.print(arr[i]+" ");
				mainCount++;
			}
		}
		return mainCount;
	}
}
