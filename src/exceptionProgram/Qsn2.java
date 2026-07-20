package exceptionProgram;

import java.util.Scanner;

public class Qsn2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Student s = new Student(101, "Ramu", 0);
		try {
			System.out.println("Enter The Marks: ");
			s.setMarks(sc.nextInt());
			
			System.out.println("Student Get "+s.calculateGrade()+" Grade.");
		}
		catch (InvalidMarksException e) {
			System.out.println("Marks are Invalid...");
		}
		finally {
			System.out.println("Result Processing Completed.");
		}
	}
}


class Student{
	public int rollNo;
	public String name;
	public int marks;
	
	public Student(int rollNo, String name, int marks) {
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}
	
	public void setMarks(int marks) throws InvalidMarksException{
		if(marks<0 || marks>100) {
			throw new InvalidMarksException("Marks should be between 0 to 100");
		}
		else {
			this.marks = marks;
			System.out.println("Marks Set Successfully.");
		}
	}
	
	public String calculateGrade() {
		if(marks>=90 && marks<=100) return "A+";
		else if(marks>=75 && marks<=89) return "A";
		else if(marks>=60 && marks<=74) return "B";
		else if(marks>=40 && marks<=59) return "C";
		else return "Fail";
	}
	
}

class InvalidMarksException extends Exception{

	public InvalidMarksException(String msg) {
		super(msg);
	}
	
}