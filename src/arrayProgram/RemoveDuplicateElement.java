package arrayProgram;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicateElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);    
		
		System.out.println("Enter array Size: ");
		int size = sc.nextInt();
		
		System.out.println("Enter array Elements: ");
		int []arr = new int [size];
		
		for(int i = 0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("With out Duplicate number array is :"+Arrays.toString(removeDuplicate(arr)));
		sc.close();
	}
	
	public static int[] removeDuplicate(int arr[]) {
		int count=0;
		for(int i=0; i<arr.length; i++) {
			boolean flag = true;
			for(int j=i-1; j>=0; j--) {
				if(arr[i]==arr[j]) {
					flag=false;
					break;
				}
			}
			if(flag) {
				count++;
			}
		}
		int []ans = new int[count];
		int k=0;
		for(int i=0; i<arr.length; i++) {
			boolean flag = true;
			for(int j=i-1; j>=0; j--) {
				if(arr[i]==arr[j]) {
					flag=false;
					break;
				}
			}
			if(flag) {
				ans[k++]=arr[i];
			}
		}
		return ans;
	}
}
