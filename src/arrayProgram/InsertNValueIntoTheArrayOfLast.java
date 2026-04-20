package arrayProgram;

import java.util.Arrays;
import java.util.Scanner;

public class InsertNValueIntoTheArrayOfLast {
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
		for(int i=0; i<arr2.length; i++) {
			if(i<arr.length) {
				arr2[i] = arr[i];
			}
			else {
				arr2[i]=insert;
			}
		}
		
		System.out.println("New Array is: "+Arrays.toString(arr2));
		sc.close();
	}
}
