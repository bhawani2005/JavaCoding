package arrayProgram;

import java.util.Scanner;

public class PrintAllSubArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);    
		
		System.out.println("Enter array Size: ");
		int size = sc.nextInt();
		
		System.out.println("Enter array Elements: ");
		int []arr = new int [size];
		
		for(int i = 0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		printSubArray(arr);
		sc.close();
	}
	
	public static void printSubArray(int[] arr) {
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			for(int j=i; j<arr.length; j++) {
				int sum1=0;
				System.out.print("");
				for(int k = i; k<=j; k++) {
					System.out.print(arr[k]+" ");
					sum1+=arr[k];
				}
				System.out.print(" = "+sum1);
				System.out.println();
				sum+=sum1;
			}
		}
		
		System.out.println("Sum of Subarray: "+sum);
	}
}
