package arrayProgram;

import java.util.Scanner;

public class AllPairsWithTargetSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);    
		
		System.out.println("Enter array Size: ");
		int size = sc.nextInt();
		
		System.out.println("Enter array Elements: ");
		int []arr = new int [size];
		
		for(int i = 0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter target value: ");
		int target = sc.nextInt();
		
		pairSum(arr, target);
		sc.close();
	}
	
	public static void pairSum(int []arr, int target) {
		for(int i=0; i<arr.length; i++) {
			for(int j=i; j<arr.length; j++) {
				if(arr[i]+arr[j] == target && i!=j) {
					System.out.println("["+arr[i]+", "+arr[j]+"]");
				}
			}
		}
	}
}
