package constructorOverlodingQuestion;

public class Qsn2 {
	public static void main(String[] args) {
		StudentResult sr1 = new StudentResult("Bhawani Shankar", 12, 444, 500);
		sr1.displayResult();
		
		StudentResult sr2 = new StudentResult("Sudip", 16, 415, 500, 'B');
		sr2.displayResult();
		
		
	}
}


class StudentResult{
	String studentName;
	int rollNo;
	double marks;
	double totalMarks;
	char grade;
	
	StudentResult(String studentName, int rollNo, double marks, double totalMarks){
		this.studentName = studentName;
		this.rollNo = rollNo;
		this.marks = marks;
		this.totalMarks = totalMarks;
		calculatePercentage();
	}
	
	StudentResult(String studentName, int rollNo, double marks, double totalMarks, char grade){
		this(studentName,rollNo,marks,totalMarks);
		this.grade = grade;
	}
	
	public void calculatePercentage() {
		if(grade=='\0'){
			double percentage = (marks/totalMarks)*100;
			if(percentage>=90) {
				grade = 'A';
			}
			else if(percentage>=75) {
				grade = 'B';
			}
			else if(percentage>=50) {
				grade = 'C';
			}
			else {
				grade='F';
			}
		}
	}
	
	public void displayResult() {
		System.out.println("Student Name: "+studentName);
		System.out.println("Roll Number: "+rollNo);
		System.out.println("Marks: "+marks);
		System.out.println("Total Marks: "+totalMarks);
		System.out.println("Grade: "+grade);
	}
}