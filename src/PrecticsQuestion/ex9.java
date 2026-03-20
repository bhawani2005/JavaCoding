/*
Enter a initial prime number : 11
Enter the value of n: 4
11 13 17 19 
   23 29 31 
      37 41 
         43 
*/
package precticsQuestion;

import java.util.Scanner;

public class ex9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a initial prime number : ");
		int num = sc.nextInt();
		System.out.print("Enter the value of n: ");
		int row=sc.nextInt();
		for(int i=1; i<=row; i++) {
			for(int j=1; j<=row; j++) {
				if(i<=j) {
					while(true){
			            int nextNum=num;
			            boolean flag = true;
			            for(int a=2; a<nextNum/2;a++){
			                if(nextNum%a==0){
			                    flag = false;
			                    break;
			                }
			            }
			            if(flag){
			                System.out.print(nextNum+" ");
			                num=nextNum+1;
			                break;
			            }
			            else {
			            	num=nextNum+1;
			            }
			        }
				}
				else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
		sc.close();
	}

}
