package assignmentQuestionOnMethod;

public class Qsn19 {
	public static int sumNumber() {
		int sum = 0;
		for(int i=1; i<=10; i++) {
			sum += i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println("Sum of 1 to 10 : "+sumNumber());
	}
}
