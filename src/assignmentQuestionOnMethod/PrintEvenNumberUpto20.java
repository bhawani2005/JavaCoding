package assignmentQuestionOnMethod;

public class PrintEvenNumberUpto20 {
	public static void main(String[] args) {
		printEvenNumber();
	}
	
	public static void printEvenNumber() {
		for(int i=1; i<=20; i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}
}
