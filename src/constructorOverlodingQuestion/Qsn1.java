package constructorOverlodingQuestion;

public class Qsn1 {
	public static void main(String[] args) {
		EmployeeSalary es1 = new EmployeeSalary("Bhawani Shankar Dhara", 201, 60000, 7);
		es1.displayEmployee();
		
		EmployeeSalary es2 = new EmployeeSalary("Ankit Rathore", 202, 30000, 5, 40);
		es2.displayEmployee();
	}
}

class EmployeeSalary{
	String employeeName;
	int employeeId;
	double basicSalary;
	int experience;
	double allowance;
	double totalSalary;
	
	EmployeeSalary(String employeeName, int employeeId, double basicSalary, int experience) {
		this.employeeName = employeeName;
		this.employeeId = employeeId;
		this.basicSalary = basicSalary;
		this.experience = experience;
		calculateSalary();
	}
	
	EmployeeSalary(String employeeName, int employeeId, double basicSalary, int experience, int allowance ) {
		this(employeeName, employeeId, basicSalary, experience);
		this.allowance = allowance;
		calculateSalary();
	}
	
	public void calculateSalary(){
		if(allowance==0) {
			if(experience>10) {
				allowance = 30;
				totalSalary = basicSalary+(basicSalary*0.3);
			}
			else if(experience>5) {
				allowance = 20;
				totalSalary = basicSalary+(basicSalary*0.2);
			}
			else {
				allowance = 10;
				totalSalary = basicSalary+(basicSalary*0.1);
			}
		}
		else {
			totalSalary = basicSalary+(basicSalary*(allowance/100));
		}
	}
	
	public void displayEmployee() {
		System.out.println("Employee Name: "+employeeName);
		System.out.println("Employee Id: "+employeeId);
		System.out.println("Basic Salary: "+basicSalary);
		System.out.println("Experience: "+experience);
		System.out.println("Allowance: "+allowance);
		System.out.println("Total Salary: "+totalSalary);
	}
}