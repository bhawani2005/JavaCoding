package inheritance;


public class EmployeeMain {
	public static void main(String[] args) {
		Developer d1 = new Developer("Bhawani", 502, 60000, 20);
		d1.displayDetails();
		d1.calculateSalary();
		
		System.out.println("------------------------------------------");
		
		Managers m1 = new Managers("Ankit", 602, 35000, 40);
		m1.displayDetails();
		m1.calculateSalary();
		
		System.out.println("------------------------------------------");
		
		Tester t1 = new Tester("Mahandra", 702, 56000, 3, 6000);
		t1.displayDetails();
		t1.calculateSalary();
	}
}

class Employee1{
	String name;
	int id;
	double basicSalary;
	
	public Employee1(String name, int id, double basicSalary) {
		this.name = name;
		this.id = id;
		this.basicSalary = basicSalary;
	}
	
	public void displayDetails() {
		System.out.println("Name: "+name);
		System.out.println("Id: "+id);
		System.out.println("Basic Salary: "+basicSalary);
	}
}

class Developer extends Employee1{
	double bonus;

	public Developer(String name, int id, double basicSalary, double bonus) {
		super(name, id, basicSalary);
		this.bonus = bonus;
	}
	
	public void calculateSalary() {
		System.out.println("Bonus: "+bonus);
		System.out.println("Total Salary: "+(basicSalary+((basicSalary)*(bonus/100))));
	}
}

class Managers extends Employee1{
	double incentive;
	
	public Managers(String name, int id, double basicSalary, double incentive) {
		super(name, id, basicSalary);
		this.incentive = incentive;
	}

	public void calculateSalary() {
		System.out.println("Bonus: "+incentive);
		System.out.println("Total Salary: "+(basicSalary+((basicSalary)*(incentive/100))));
	}
}

class Tester extends Employee1{
	int overtimeHours;
	double ratePerHour;
	
	public Tester(String name, int id, double basicSalary, int overtimeHours, double ratePerHour) {
		super(name, id, basicSalary);
		this.overtimeHours = overtimeHours;
		this.ratePerHour = ratePerHour;
	}
	
	public void calculateSalary() {
		System.out.println("Over Time Hours: "+overtimeHours);
		System.out.println("Rate Per Hour: "+ratePerHour);
		System.out.println("Total Salary: "+(basicSalary+(overtimeHours*ratePerHour)));
	}
}
