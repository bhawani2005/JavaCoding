package arrayProgram;

import java.util.Scanner;

public class FindNonRepeatingElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter array Size: ");
		int size = sc.nextInt();
		
		System.out.println("Enter array Elements: ");
		int []arr = new int [size];
		
		for(int i = 0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Non repeating Elements are : ");
		findNonRepeating(arr);
		sc.close();
	}
	
	public static void findNonRepeating(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			int count=0;
			for(int j=0; j<arr.length; j++) {
				if(arr[i]==arr[j] && i!=j) {
					count++;
				}
			}
			if(count==0) {
				System.out.print(arr[i]);
			}
		}
	}
}
