package arrayProgram;

import java.util.Arrays;
import java.util.Scanner;

public class InsertNValueIntoTheArrayOfFirst {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter array Size: ");
		int size = sc.nextInt();
		
		System.out.println("Enter array Elements: ");
		int []arr = new int [size];
		
		for(int i = 0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter Element To Insert: ");
		int insert = sc.nextInt();
		
		int []arr2 = new int[arr.length+1];
		arr2[0]=insert;
		for(int i=1; i<arr2.length; i++) {
			arr2[i] = arr[i-1];
			
		}
		
		System.out.println("New Array is: "+Arrays.toString(arr2));
		sc.close();
	}
}
