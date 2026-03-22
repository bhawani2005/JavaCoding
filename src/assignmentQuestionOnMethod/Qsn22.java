package assignmentQuestionOnMethod;

public class Qsn22 {
	public static int sumDigit() {
		int n=456;
		int sum = 0;
		while(n!=0) {
			sum+=(n%10);
			n/=10;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println("Sum of 456 digit's is: "+sumDigit());
	}
}
