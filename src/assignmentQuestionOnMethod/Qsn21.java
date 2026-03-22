package assignmentQuestionOnMethod;

public class Qsn21 {
	public static boolean isPrime() {
		boolean flag = true;
		int num = 7;
		int i=2;
		while(i<=num/2) {
			if(num%i==0) {
				flag = false;
				break;
			}
			i++;
		}
		return flag;
	}
	
	public static void main(String[] args) {
		System.out.println(isPrime());
	}
}
