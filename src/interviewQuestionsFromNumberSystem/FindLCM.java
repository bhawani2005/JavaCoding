package interviewQuestionsFromNumberSystem;

import java.util.Scanner;

public class FindLCM {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number : ");
		int num1 = sc.nextInt();
		System.out.print("Enter second number : ");
		int num2 = sc.nextInt();
		int lcm=0;
		int max = (num1>num2)? num1 : num2;
		while(true) {
			if(max%num1==0 && max%num2==0) {
				lcm=max;
				break;
			}
			max++;
		}
		System.out.print("LCM of Two Number : "+lcm);
		sc.close();
	}

}
