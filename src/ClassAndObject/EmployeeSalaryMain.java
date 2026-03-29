package classAndObject;

public class EmployeeSalaryMain {
	public static void main(String[] args) {
		EmpolyeeSalary es = new EmpolyeeSalary();
		es.name="BhawaniShankar";
		es.bs=20000;
		
		es.displaySalaryDetaile();
		
		
	}
}

class EmpolyeeSalary{
	public String name;
	public double bs;
	public double hra;
	public double da;
	public double ts;
	
	public double calculateHRA() {
		return bs*0.1;
	}
	
	public double calculateDA() {
		return bs*0.2;
	}
	
	public double calculateTotalSalary() {
		return bs+calculateHRA()+calculateDA();
	}
	
	public void displaySalaryDetaile() {
		System.out.println("Empolyee Name: "+name);
		System.out.println("Basic Salary: "+bs);
		System.out.println("HRA: "+calculateHRA());
		System.out.println("DA: "+calculateDA());
		System.out.println("Total Salary: "+calculateTotalSalary());
	}
	
	
}
