package constructor;

public class EmployeeMain {
	public static void main(String[] args) {
		Employee e1 = new Employee("SudipMaity", 401, 20000);
		e1.displayEmployee();
		
		System.out.println("-------------------------------------------");
		
		Employee e2 = new Employee("HemantaBarik", 402, 50000,"HR");
		e2.displayEmployee();
		
		System.out.println("-------------------------------------------");
		
		Employee e3 = new Employee("BhawaniShankarDhara", 501, 100000, "SoftwareEngineer", 11);
		e3.displayEmployee();
	}
}

class Employee{
	String name;
	int employeeId;
	double salary;
	String department;
	int yearOfExperience;
	
	Employee(String name, int employeeId, double salary){
		this.name = name;
		this.employeeId = employeeId;
		this.salary = calculateSalary(salary);
	}
	
	Employee(String name, int employeeId, double salary, String department){
		this(name, employeeId, salary);
		this.department = department;
	}
	
	Employee(String name, int employeeId, double salary, String department, int yearOfExperience){
		this(name, employeeId, salary, department);
		this.yearOfExperience = yearOfExperience;
	}
	
	double calculateSalary(double salary){
		if(yearOfExperience>=10) {
			return salary+(salary*0.2);
		}
		else if(yearOfExperience>=5) {
			return salary+(salary*0.1);
		}
		else {
			return salary+(salary*0.05);
		}
	}
	
	public void displayEmployee() {
		System.out.println("Name: "+name);
		System.out.println("Employee Id: "+employeeId);
		System.out.println("Salary: "+salary);
		System.out.println("Department: "+department);
		System.out.println("Year Of Experience: "+yearOfExperience);
	}
}