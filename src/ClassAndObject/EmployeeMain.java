package ClassAndObject;

class Employee{
	public String name;
	public double salary;
	public int id;
	public String department;
	
	public void displayDetails() {
		System.out.println("Name : "+name);
		System.out.println("Salary : "+salary);
		System.out.println("Id : "+id);
		System.out.println("Department : "+department);
	}
}

public class EmployeeMain {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.name = "Ram";
		e1.salary = 35000;
		e1.id = 301;
		e1.department = "HR";
		e1.displayDetails();
		
		Employee e2 = new Employee();
		e2.name = "Ankit";
		e2.salary = 25000;
		e2.id = 302;
		e2.department = "Software Devloper";
		e2.displayDetails();
	}
}
