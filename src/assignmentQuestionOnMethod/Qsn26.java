package assignmentQuestionOnMethod;

public class Qsn26 {
	public static int reverseNumber(int num) {
		int rev = 0;
		while(num!=0) {
			rev = (rev*10)+(num%10);
			num/=10;
		}
		return rev;
	}
	
	public static void main(String[] args) {
		System.out.println(reverseNumber(123));
	}
}
