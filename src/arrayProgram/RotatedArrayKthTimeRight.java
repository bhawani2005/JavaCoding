package arrayProgram;

import java.util.Arrays;
import java.util.Scanner;

public class RotatedArrayKthTimeRight {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter array Size: ");
		int size = sc.nextInt();
		
		System.out.println("Enter array Elements: ");
		int []arr = new int [size];
		
		for(int i = 0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter the value of k");
		int k=sc.nextInt();
		for(int i=1; i<=k; i++) {
			arr=rotatedArray(arr);
		}
		
		System.out.println("Rotated Array for "+k+"th time in right direction is :"+Arrays.toString(arr));
		sc.close();
	}
	
	public static int[] rotatedArray(int []arr) {
		int temp = arr[arr.length-1];
		for(int i=arr.length-1; i>=1; i--) {
			arr[i]=arr[i-1];
		}
		arr[0] = temp;
		return arr;
	}
}
