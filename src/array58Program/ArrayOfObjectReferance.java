package array58Program;

import java.util.Scanner;

public class ArrayOfObjectReferance {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number of Student : ");
		Student [] students = new Student[sc.nextInt()];
		sc.nextLine();
		
		for(int i=0; i<students.length; i++) {
			String name = sc.nextLine();
			int age = sc.nextInt();
			double percentage = sc.nextDouble();
			sc.nextLine();
			String dept = sc.nextLine();
			
			students[i] = new Student(name, age, percentage, dept);
		}
//		students[0] = new Student("Rahul", 21, 95.28, "CSE");
//		students[1] = new Student("Anu", 20, 86.28, "ME");
//		students[2] = new Student("Kriti", 24, 75.69, "EEE");
		
		
		for(int i=0; i<students.length; i++) {
			students[i].displayStudentInfo();
			System.out.println("======================================================");
		}
		
		sc.close();
	}
}


class Student {
	private String name;
	private int age;
	private double percentage;
	private String department;
	
	public Student(String name, int age, double percentage, String department) {
		this.name = name;
		this.age = age;
		this.percentage = percentage;
		this.department = department;
	}
	
	public void displayStudentInfo() {
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Percentage : "+percentage);
		System.out.println("Department : "+department);
	}
	
}

class Employee {
	
}