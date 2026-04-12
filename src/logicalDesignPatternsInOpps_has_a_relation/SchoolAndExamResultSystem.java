package logicalDesignPatternsInOpps_has_a_relation;

import java.util.ArrayList;
import java.util.List;

public class SchoolAndExamResultSystem {
	public static void main(String[] args) {
		Student s1 = new Student("Sudip", 60, 85, 78, 69);
		Student s2 = new Student("Pupun", 58, 75, 95, 86);
		
		Teacher t1 = new Teacher("Roji", "COA");
		Teacher t2 = new Teacher("Mahandra", "Java");
		
		List<Student> students = new ArrayList<>();
		students.add(s1);
		students.add(s2);
		
		List<Teacher> teachers = new ArrayList<>();
		teachers.add(t1);
		teachers.add(t2);
		
		School s = new School(students, teachers);
		
		ResultSystem rs = new ResultSystem(s);
		rs.displayResult(s1);
	}
}


class Marks{
	
	public int subject1;
	public int subject2;
	public int subject3;
	public int subject4;
	
	public Marks(int subject1, int subject2, int subject3, int subject4) {
		this.subject1 = subject1;
		this.subject2 = subject2;
		this.subject3 = subject3;
		this.subject4 = subject4;
	}
	
	public int calculateTotal() {
		return (subject1+subject2+subject3+subject4);
	}
	
	public int calculateAverage() {
		return (calculateTotal()/4);
	}
}

class Student{
	private String name;
	private Marks marks;
	
	public Student(String name, int sub1, int sub2, int sub3, int sub4) {
		this.name = name;
		this.marks = new Marks(sub1, sub2, sub3, sub4);
	}
	
	public Marks getMarks() {
		return marks;
	}
	
	public String getName() {
		return name;
	}
}

class Teacher{
	public String name;
	public String subject;
	
	public Teacher(String name, String subject) {
		this.name = name;
		this.subject = subject;
	}
}

class School{
	List<Student> students;
	List<Teacher> teachers;
	
	public School(List<Student>students, List<Teacher>teachers) {
		this.students = students;
		this.teachers = teachers;
	}
}

class ResultSystem{
	School school;
	
	public ResultSystem(School school) {
		this.school = school;
	}
	
	public void displayResult(Student s) {
		System.out.println("Student Name: "+s.getName());
		System.out.println("Total Marks: "+s.getMarks().calculateTotal());
		System.out.println("Average Marks: "+s.getMarks().calculateAverage());
	}
}