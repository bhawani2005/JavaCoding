package arrayProgram;

import java.util.Scanner;

public class FrequencyOfEachElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);    
		
		System.out.println("Enter array Size: ");
		int size = sc.nextInt();
		
		System.out.println("Enter array Elements: ");
		int []arr = new int [size];
		
		for(int i = 0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		frequencyOfEachElement(arr);
		sc.close();
	}
	
	public static void frequencyOfEachElement(int []arr) {
		for(int i=0; i<arr.length; i++) {
			boolean isPriviouslyPresent = true;
			for(int j=i-1; j>=0; j--) {
				if(arr[i]==arr[j]) {
					isPriviouslyPresent = false; 
					break;
				}
			}
			if(isPriviouslyPresent) {
				int count=0;
				for(int k=0; k<arr.length; k++) {
					if(arr[i]==arr[k]) {
						count++;
					}
				}
				System.out.println(arr[i]+" is Priviously present "+count+" times.");
			}
		}
	}
}
