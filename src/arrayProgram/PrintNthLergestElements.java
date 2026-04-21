package arrayProgram;

import java.util.Scanner;

public class PrintNthLergestElements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter array Size: ");
		int size = sc.nextInt();
		
		System.out.println("Enter array Elements: ");
		int []arr = new int [size];
		
		for(int i = 0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the value of n: ");
		int n = sc.nextInt();
		if(arr.length<n) {
			System.out.println("N is greater then Array of Size.");
		}
		else {
			for(int i=0; i<arr.length; i++) {
				int count = 0;
				for(int j=0; j<arr.length; j++) {
					if(arr[i]<arr[j]) {
						count++;
					}
				}
				if(count == (n-1)) {
					System.out.println(n+"th lergest Number is "+arr[i]);
					break;
				}
			}
		}
		sc.close();
	}
}
