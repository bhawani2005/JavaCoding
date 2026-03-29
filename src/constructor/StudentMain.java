package constructor;

public class StudentMain {
	public static void main(String[] args) {
		Student s1 = new Student("BhawaniShankar", 12, "JavaFullStack");
		s1.displayDetails();
		
		System.out.println("-------------------------------------------------------");
		
		Student s2 = new Student("AnkitRathor", 24, "JavaFullStack", 68);
		s2.displayDetails();
		
		System.out.println("-------------------------------------------------------");
		
		Student s3 = new Student("RitunJena", 50, "PythonFullStack", 54, 'D');
		s3.displayDetails();
	}
}

class Student{
	String studentName;
	int rollNumber;
	String course;
	int marks;
	char grade;
	
	Student(String studentName, int rollNumber, String course){
		this.studentName = studentName;
		this.rollNumber = rollNumber;
		this.course = course;
	}
	
	Student(String studentName, int rollNumber, String course, int marks){
		this(studentName, rollNumber, course);
		this.marks = marks;
		calculateGrade();
		
	}
	
	Student(String studentName, int rollNumber, String course, int marks, char grade){
		this(studentName, rollNumber, course, marks);
		this.grade = grade;
	}
	
	void calculateGrade() {
		if(marks<=100 && marks>=90) {
			grade='A';
		}
		else if(marks<=89 && marks>=75) {
			grade='B';
		}
		else if(marks<=74 && marks>=60) {
			grade='C';
		}
		else if(marks<=59 && marks>=40) {
			grade='D';
		}
		else {
			grade='F';
		}
	}
	
	public void displayDetails() {
		System.out.println("Student Name: "+studentName);
		System.out.println("Roll Number: "+rollNumber);
		System.out.println("Coures: "+course);
		System.out.println("Marks: "+marks);
		System.out.println("Grade: "+grade);
	}
}
