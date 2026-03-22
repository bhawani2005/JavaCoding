package assignmentQuestionOnMethod;

public class Qsn30 {
	public static boolean armstrongNumber(int num) {
		int temp=num, sum=0;
		int count = (int)(Math.log10(num)+1);
		while(temp!=0) {
			sum += Math.pow((temp%10), count);
			temp /= 10;
		}
		return sum==num;
	}
	
	public static void main(String[] args) {
		System.out.println(armstrongNumber(153));
				
	}
}
