package assignmentQuestionOnMethod;

public class Qsn28 {
	public static boolean checkPrime(int n) {
		int i=2;
		while(i<=n/2) {
			if(n%i==0) {
				return false;
			}
			i++;
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(checkPrime(7));
	}
}
