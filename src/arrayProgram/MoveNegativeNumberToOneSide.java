package arrayProgram;

import java.util.Arrays;
import java.util.Scanner;

public class MoveNegativeNumberToOneSide {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter array Size: ");
		int size = sc.nextInt();
		
		System.out.println("Enter array Elements: ");
		int []arr = new int [size];
		
		for(int i = 0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("New Array Is : "+Arrays.toString(MoveNegative(arr)));
		sc.close();
	}
	
	public static int[] MoveNegative(int arr[]) {
		for(int i=0, j=0; i<arr.length; i++) {
			if(arr[i]<0) {
				int temp = arr[i];
				arr[i]=arr[j];
				arr[j] = temp;
				j++;
			}
		}
		return arr;
	}
}
