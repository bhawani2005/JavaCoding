package methodOverloding;

import java.util.Scanner;

class StrongNumber{
	public boolean checkStrong(int n) {
		int temp = n, sum=0;
		while(temp!=0) {
			int fact=1;
			for(int i=1; i<=(temp%10); i++) {
				fact*=i;
			}
			sum+=fact;
			temp/=10;
		}
		return (sum==n);
	}
	
	public void checkStrong(int start, int end) {
		for(int i=start; i<=end; i++) {
			int temp = i, sum=0;
			while(temp!=0) {
				int fact=1;
				for(int j=1; j<=(temp%10); j++) {
					fact*=j;
				}
				sum+=fact;
				temp/=10;
			}
			if(sum==i) {
				System.out.print(i);
			}
		}
	}
} 

public class StrongNumberProgram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("MENU");
		System.out.println("Enter 1 to check whether a number is a strong number");
		System.out.println("Enter 2 to print strong numbers in a given range");
		System.out.println("-------------------------------------------------------");
		System.out.println("Enter your choice: ");
		int ch = sc.nextInt();
		StrongNumber ob = new StrongNumber();
		
		switch (ch) {
		case 1: {
			System.out.println("Enter a number: ");
			int num=sc.nextInt();
			System.out.println(ob.checkStrong(num));
			break;
		}
		case 2: {
			System.out.println("Enter start value: ");
			int s=sc.nextInt();
			System.out.println("Enter end value: ");
			int e=sc.nextInt();
			ob.checkStrong(s, e);
			break;
		}
		default:
			System.out.println("Invalid choice......");
		}
		sc.close();
	}
}
