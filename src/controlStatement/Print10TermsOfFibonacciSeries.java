package controlStatement;

public class Print10TermsOfFibonacciSeries {

	public static void main(String[] args) {
		int range = 10;
		int a=0;
		int b=1;
		int i=1;
		int sum=0;
		while(i<=range) {
			System.out.println(sum);
			a=b;
			b=sum;
			sum=a+b;
			i++;
		}

	}

}
