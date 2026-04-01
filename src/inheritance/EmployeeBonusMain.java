package inheritance;

public class EmployeeBonusMain {
	public static void main(String[] args) {
		BonusEmployee be1 = new BonusEmployee("Bhawani Shankar", 201, 20000, 20);
		be1.displayDetails();
		be1.calculateSalary();
	}
}

class Employee{
	String name;
	int id;
	double salary;
	
	public void displayDetails(){
		System.out.println("Name: "+name);
		System.out.println("Id: "+id);
	}
	
	public void calculateSalary() {
		System.out.println("Salary"+salary);
	}
}

class BonusEmployee extends Employee{
	double bonus;
	
	
	
	public BonusEmployee(String name,int id, double salary,double bonus) {
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.bonus = bonus;
	}

	public void displayDetails(){
		System.out.println("Name: "+name);
		System.out.println("Id: "+id);
	}
	
	public void calculateSalary() {
		System.out.println("Salary"+salary);
		System.out.println("Bonus: "+bonus );
		System.out.println("Total Salary : "+(salary+(salary*(bonus/100))));
	}
}