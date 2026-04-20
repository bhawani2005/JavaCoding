package arrayProgram;

import java.util.Arrays;
import java.util.Scanner;

public class LargestElementOfArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter array Size: ");
		int size = sc.nextInt();
		
		System.out.println("Enter array Elements: ");
		int []arr = new int [size];
		
		for(int i = 0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
			
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		
		System.out.println("Given array Is : "+Arrays.toString(arr));
		System.out.println("Largest Element in Array is : "+max);
		System.out.println("Smallest Element in Array is: "+min);
		sc.close();
	}
}
