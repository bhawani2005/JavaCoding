package arrayProgram;

import java.util.Scanner;

public class FindMinimumDifferenceBetweenTwoElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);    
		
		System.out.println("Enter array Size: ");
		int size = sc.nextInt();
		
		System.out.println("Enter array Elements: ");
		int []arr = new int [size];
		
		for(int i = 0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		minimumDifferenceBetweenTwoElement(arr);
		sc.close();
	}
	
	public static void minimumDifferenceBetweenTwoElement(int arr[]) {
		int min = Integer.MAX_VALUE;
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				min = Math.min(min, Math.abs(arr[i]-arr[j]));
			}
		}
		
		System.out.println("Minimum Difference is : "+min);
	}
}
