package assignmentQuestionOnMethod;

public class Qsn18 {
	public static void main(String[] args) {
		System.out.println("Factorial value of 5 is : "+factorial());
	}
	
	public static int factorial() {
		int fact = 1;
		for(int i=1; i<=5; i++) {
			fact *= i;
		}
		return fact;
	}
}
