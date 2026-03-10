package interviewQuestionsFromNumberSystem;

import java.util.Scanner;

public class CheckMagicNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		int count = ((int)Math.log10(num))+1;
		int temp = num;
		int sum=0;
		if(count == 1) {
			System.out.println("It is NOT a Magic number.");
		}
		else {
			while(true) {
				sum=0;
				while(temp!=0) {
					int ld = temp%10;
					sum += ld;
					temp /=10;
				}
				if(((int)Math.log10(sum)+1)==1) {
					break;
				}
				else {
					temp=sum;
				}
			}
			if(sum==1) {
				System.out.print("Magic number.");
			}
			else {
				System.out.println("NOT Magic number.");
			}
		}
		sc.close();
	}

}
