package arrayProgram;

import java.util.Scanner;

public class FindMajorityElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);    
		
		System.out.println("Enter array Size: ");
		int size = sc.nextInt();
		
		System.out.println("Enter array Elements: ");
		int []arr = new int [size];
		
		for(int i = 0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		System.err.println("The mejority Element is : "+findMejorityElement(arr));
	}
	
	public static int findMejorityElement(int []arr) {
		for(int i=0; i<arr.length; i++) {
			int count=0;
			for(int j=0; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			if(count>(arr.length/2)) {
				return arr[i];
			}
		}
		return -1;
	}
}
