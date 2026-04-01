package inheritance;

public class PersonMain {
	public static void main(String[] args) {
		
	}
}

class Person{
	String name;
	int age;
	
	public void displayDetails() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
	}
}

class Employee extends Person{
	double salary;

	public Employee(String name,int age,double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	public void displaySalary() {
		System.out.println("Salary: "+salary);
	}
	
}

class Manager extends Employee{
	double bonus;

	public Manager(String name, int age, double salary, double bonus) {
		super(name, age, salary);
		this.bonus = bonus;
	}

	
	
}