package arrayProgram;

import java.util.Arrays;
import java.util.Scanner;

public class ZeroIsMoveToLast {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter array Size: ");
		int size = sc.nextInt();
		
		System.out.println("Enter array Elements: ");
		int []arr = new int [size];
		
		for(int i = 0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Move Zeros to last : "+Arrays.toString(moveZerosToLast2(arr)));
		sc.close();
	}
	
	public static int[] moveZerosToLast1(int arr[]) {
		int ans[] = new int[arr.length];
		int k=0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] != 0) {
				ans[k++]=arr[i];
			}
		}
		
		return ans;
	}
	
	public static int[] moveZerosToLast2(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == 0) {
				for(int j=i; j<arr.length-1; j++) {
					arr[j] = arr[j+1];
				}
				arr[arr.length-1]=0;
			}
		}
		return arr;
	}
}
