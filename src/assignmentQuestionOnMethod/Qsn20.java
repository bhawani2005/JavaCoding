package assignmentQuestionOnMethod;

public class Qsn20 {
	public static int reverseNumber() {
		int n=1234;
		int rev =0;
		while(n!=0) {
			rev = (rev*10)+(n%10);
			n/=10;
		}
		return rev;
	}
	
	public static void main(String[] args) {
		System.out.println("Reverse of 1234 is : "+reverseNumber());
	}
}
