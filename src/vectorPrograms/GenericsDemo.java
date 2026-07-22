package vectorPrograms;

public class GenericsDemo {
	public static void main(String[] args) {
		Employee e = new Employee("Kanha", 40000);
		Student1 s = new Student1("Rahul", 22);
		
		Process<Student1> p = new Process<Student1>(s);
		
	}
}

class Process<T>{
	T obj;
	
	public Process(T obj) {
		super();
		this.obj = obj;
	}

}

class Student1{
	String name;
	double age;
	
	
	public Student1(String name, double age) {
		super();
		this.name = name;
		this.age = age;
	}


	public void displayDetails() {
		System.out.println("Name: "+name);
		System.out.println("Salary: "+age);
	}
	
	
}

class Employee{
	String name;
	double salary;
	
	
	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}


	public void displayDetails() {
		System.out.println("Name: "+name);
		System.out.println("Salary: "+salary);
	}
	
	
}