package arrayProgram;

import java.util.Scanner;

public class ArrayOfObjects {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size = sc.nextInt();
		
		Student []a = new Student[size]; 
		
		System.out.println("Enter student name and age one by one :");
		for(int i=0; i<a.length; i++) {
			a[i] = new Student(sc.next(), sc.nextInt());
		}
		
		for(int i=0; i<a.length; i++) {
			System.out.println("Name : "+a[i].name+" and age : "+a[i].age);
		}
		
		sc.close();
	}
}

class Student{
	String name;
	int age;
	
	Student(String name, int age){
		this.name = name;
		this.age = age;
	}
}

class Employee extends Student{

	public Employee(String name, int age) {
		super(name, age);
	}
	
}