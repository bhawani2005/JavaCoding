package assignmentQuestionOnMethod;

public class Qsn7 {
	public static void main(String[] args) {
		sumNumber();
	}
	
	public static void sumNumber() {
		int sum=0;
		for(int i=1; i<=10; i++) {
			sum += i;
		}
		System.out.println("Sum of 1 to 10 is : "+sum);
	}
}
