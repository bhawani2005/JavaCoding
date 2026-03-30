package constructor;

public class ExamResultMain {
	public static void main(String[] args) {
		ExamResult er1 = new ExamResult("Bhawani Shankar Dhara", 12, 90, 84);
		er1.displayResult();
		
		System.out.println("-------------------------------------------------------");
		
		ExamResult er2 = new ExamResult("Hemanta", 54, 80, 50, 75, "Pass");
		er2.displayResult();
	}
}


class ExamResult{
	String studentName;
	int rollNumber;
	double subject1Marks;
	double subject2Marks;
	double percentage;
	String result;
	
	ExamResult(String studentName, int rollNumber, double subject1Marks, double subject2Marks){
		this.studentName = studentName;
		this.rollNumber = rollNumber;
		this.subject1Marks = subject1Marks;
		this.subject2Marks = subject2Marks;
		calculatePercentage();
		determineResult();
	}
	
	ExamResult(String studentName, int rollNumber, double subject1Marks, double subject2Marks, double percentage, String result){
		this(studentName, rollNumber, subject1Marks, subject2Marks);
		this.percentage = percentage;
		this.result = result;
	}
	
	public void calculatePercentage() {
		percentage = (subject1Marks+subject2Marks)/2;
	}
	
	public void determineResult() {
		if(percentage>=50) {
			result = "Pass";
		}
		else{
			result = "Fail";
		}
	}
	
	public void displayResult() {
		System.out.println("Student Name: "+studentName);
		System.out.println("Roll Number: "+rollNumber);
		System.out.println("Subject1 Marks: "+subject1Marks);
		System.out.println("Subject2 Marks: "+subject2Marks);
		System.out.println("Percentage: "+percentage+"%");
		System.out.println("Result: "+result);
	}
}