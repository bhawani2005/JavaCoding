package jvmArchitectureProgram;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Demo {
	public static void main(String[] args) {
		Student s = new Student("manu", 21);
		
		Class c = s.getClass();
		System.out.println(c.getName());
		Method []a = c.getDeclaredMethods();
		for(Method m : a) {
			System.out.println(m);
		}
		
		Field []b = c.getDeclaredFields();
		for(Field f : b) {
			System.out.println(f);
		}
	} 
}


class Student{
	String name;
	int age;
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	public void displayDetails() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
	}
}