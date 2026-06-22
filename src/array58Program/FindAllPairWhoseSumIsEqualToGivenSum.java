package array58Program;


import java.util.Scanner;

public class FindAllPairWhoseSumIsEqualToGivenSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Array Of Size: ");
		int size = sc.nextInt();
		
		int []arr = new int[size];
		System.out.println("Enter Array Elements : ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		
		System.out.println("Enter the target sum : ");
		int target = sc.nextInt();
		findPairByGivenSum(removeDuplicate(arr), target);
		
		sc.close();
	}
	
	public static int[] removeDuplicate(int arr[]) {

	    int sizeCount = 0;

	    for(int i=0; i<arr.length; i++) {

	        boolean isPresent = false;

	        for(int j=0; j<i; j++) {

	            if(arr[i] == arr[j]) {
	                isPresent = true;
	                break;
	            }
	        }

	        if(isPresent == false) {
	            sizeCount++;
	        }
	    }


	    int ans[] = new int[sizeCount];

	    int index = 0;

	    for(int i=0; i<arr.length; i++) {

	        boolean isPresent = false;

	        for(int j=0; j<i; j++) {

	            if(arr[i] == arr[j]) {
	                isPresent = true;
	                break;
	            }
	        }

	        if(isPresent == false) {
	            ans[index++] = arr[i];
	        }
	    }

	    return ans;
	}
	
	public static void findPairByGivenSum(int arr[], int target) {
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]+arr[j] == target) {
					System.out.println("("+arr[i]+", "+arr[j]+")");
				}
			}
		}
	}
}
