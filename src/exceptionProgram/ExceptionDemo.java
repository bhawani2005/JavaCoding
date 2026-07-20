package exceptionProgram;

public class ExceptionDemo {
	public static void main(String[] args) {
		System.out.println("Hello");
		try {
			System.out.println(4/0);
			System.out.println("Hi");
		}
		catch(ArithmeticException e) {
			System.out.println("Exception Handled");
			e.printStackTrace();
		}
		finally {
			System.out.println("Hi");
		}
		System.out.println("Bye");
	}
	
}

