package methodOverloding;

public class AddNumber {
	
	public static void add(int a, int b) {
		System.out.println("Sum is : "+(a+b));
	}
	public static void add(int a, double b) {
		System.out.println("Sum is : "+(a+b));
	}
	public static void add(double a, double b) {
		System.out.println("Sum is : "+(a+b));
	}
	
	public static void main(String[] args) {
		add(12, 13);
	}
}
