package array58Program;

import java.util.Arrays;
import java.util.Scanner;

public class FindThePairWithMinimumDifference {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Array Of Size: ");
		int size = sc.nextInt();
		
		int []arr = new int[size];
		System.out.println("Enter Array Elements : ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		
		System.out.println(Arrays.toString(findPairWithMinimumDifference(arr)));
		
		sc.close();
	}
	
	public static int[] findPairWithMinimumDifference(int arr[]) {
		int pair[] = new int[2];
		int minDifference = Integer.MAX_VALUE;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(minDifference>(Math.abs((arr[i]-arr[j])))){
					minDifference = Math.min(minDifference, Math.abs((arr[i]-arr[j])));
					pair[0] = arr[i];
					pair[1] = arr[j];
				}
				
			}
		}
		
		return pair;
	}
}
