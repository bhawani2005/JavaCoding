package inheritance;

public class PersonMain {
	public static void main(String[] args) {
		Manager m1 = new Manager("Ritun", 27, 25000, 10);
		m1.displayDetails();
		m1.displaySalary();
		m1.calculateTotalSalary();
	}
}

class Person{
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void displayDetails() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
	}
}

class Employees extends Person{
	double salary;
	
	public Employees(String name, int age, double salary) {
		super(name, age);
		this.salary = salary;
	}

	public void displaySalary() {
		System.out.println("Salary: "+salary);
	}
	
}

class Manager extends Employees{
	double bonus;

	public Manager(String name, int age, double salary, double bonus) {
		super(name, age, salary);
		this.bonus = bonus;
	}

	public void calculateTotalSalary() {
		System.out.println("Bonus: "+bonus);
		System.out.println("Total Salary: "+(salary+(salary*(bonus/100))));
	}
	
}