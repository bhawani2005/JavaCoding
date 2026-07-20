package exceptionProgram;

import java.util.Scanner;

public class ExceptionDemo2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Age: ");
		int age = sc.nextInt();
		
		try {
			if(age>100 || age<0) {
				throw new InvalidAgeException("Age Invalid...");
			}
			System.out.println("Age Accepted...");
		}
		catch(InvalidAgeException e) {
			e.printStackTrace();
		}
		
	}
}

class InvalidAgeException extends Throwable{
	public InvalidAgeException(String msg) {
		super(msg);
	}
}