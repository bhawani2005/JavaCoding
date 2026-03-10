//WAP to print prime number from 1 to 100.
package interviewQuestionsFromNumberSystem;

public class PrintPrimeNumberFrom1To100 {

	public static void main(String[] args) {
		int num=1;
		while(num<=100) {
			int i=2;
			boolean flag = true;
			while(i<=num/2) {
				if(num%i==0) {
					flag=false;
					break;
				}
				i++;
			}
			if(flag) {
				System.out.println(num);
			}
			num++;
		}

	}

}
