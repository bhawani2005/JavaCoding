package arrayListProgram;

import java.util.ArrayList;

public class CoreQsn01 {
	public static void main(String[] args) {
		StudentManagement sm = new StudentManagement();
		
		sm.addStudent(new Student("Abhi", 401, 7.5));
		sm.addStudent(new Student("Rahul", 402, 8.69));
		sm.addStudent(new Student("Kunal", 403, 5.9));
		sm.addStudent(new Student("Rohit", 404, 9.1));
		
		sm.displayAllStudent();
		
		System.out.println("=====================");
		
		System.out.println(sm.getStudent(403));
		
		System.out.println("=====================");
		
		System.out.println(sm.gpaThreshol(6.5));
		
		System.out.println("=====================");
		
		sm.updateGPA(403, 6.9);
		sm.displayAllStudent();
	}
}

class Student{
	public String name;
	public int id;
	public double gpa;
	
	public Student(String name, int id, double gpa) {
		this.name = name;
		this.id = id;
		this.gpa = gpa;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", gpa=" + gpa + "]";
	} 
}

class StudentManagement{
	public ArrayList<Student> list = new ArrayList<Student>();


	public void addStudent(Student obj) {
		list.add(obj);
	}
	
	public void displayAllStudent() {
		for(Student s : list) {
			System.out.println(s.toString());
		}
	}
	
	public Student getStudent(int id) {
		Student temp = null;
		
		for(Student s : list) {
			if(s.id == id) {
				temp = s;
			}
		}
		
		return temp;
	}
	
	public ArrayList<Student> gpaThreshol(double gpa){
		ArrayList<Student> newList = new ArrayList<Student>();
		
		for(Student s : list) {
			if(s.gpa >= gpa) {
				newList.add(s);
			}
		}
		
		return newList;
	}
	
	public void updateGPA(int id, double newGPA) {
		for (Student s : list) {
	        if (s.id == id) {
	            s.gpa = newGPA;
	            return;
	        }
	    }
	}
}
