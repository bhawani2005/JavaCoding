package assignmentQuestionOnMethod;

public class Qsn23 {
	public static boolean checkPalindrome() {
		int n=121, temp=n, rev=0;
		while(temp!=0) {
			rev = (rev*10)+(temp%10);
			temp/=10;
		}
		if(rev==n) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		System.out.print(checkPalindrome());
	}
}
