package arrayListProgram;

import java.util.ArrayList;

public class CoreQsn03 {
	public static void main(String[] args) {
		EmployeeManagement em = new EmployeeManagement();
		em.addEmployee(new Employee(401, "Arun", 23, "Development"));
		em.addEmployee(new Employee(434, "Varun", 29, "Testing"));
		em.addEmployee(new Employee(423, "Kiran", 35, "HR"));
		em.addEmployee(new Employee(412, "Sharam", 40, "Admin"));
		
		System.out.println("All Employee List : ");
		em.printAllEmployee();

		
		em.removeEmployeesByDepartment("HR");
		System.out.println("All Employee List After removing from HR Department: ");
		em.printAllEmployee();
		
		System.out.println("Employee Above Age 30 are : ");
		for(Employee e : em.getEmployeeAboveAge(30)) {
			System.out.println(e);
		}
		
		System.out.println("Employee List after sorting : ");
		for(Employee e : em.sortEmployeeById()) {
			System.out.println(e);
		}
	}
}

class EmployeeManagement{
	ArrayList<Employee> employeeList = new ArrayList<Employee>();
	
	public void addEmployee(Employee enployee) {
		employeeList.add(enployee);
	}
	
	public void removeEmployeesByDepartment(String department) {
		for(Employee e : employeeList) {
			if(e.department.equals(department)) {
				employeeList.remove(e);
			}
		}
	}
	
	public ArrayList<Employee> getEmployeeAboveAge(int age){
		ArrayList<Employee> temp = new ArrayList<Employee>();
		
		for(Employee e : employeeList) {
			if(e.age > age) {
				temp.add(e);
			}
		}
		
		return temp;
	}
	 
	public ArrayList<Employee> sortEmployeeById() {
		for(int cycle = 0; cycle < employeeList.size()-1; cycle++) {
			for(int i=0; i<employeeList.size()-1; i++) {
				if(employeeList.get(i).empId>employeeList.get(i+1).empId) {
					Employee temp = employeeList.get(i);
					employeeList.set(i, employeeList.get(i+1));
					employeeList.set(i+1, temp);
				}
			}
		}
		
		return employeeList;
	}
	
	public void printAllEmployee() {
		for(Employee e : employeeList) {
			System.out.println(e);
		}
	}
	
}

class Employee{
	public int empId;
	public String name;
	public int age;
	public String department;
	public Employee(int empId, String name, int age, String department) {
		super();
		this.empId = empId;
		this.name = name;
		this.age = age;
		this.department = department;
	}
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", age=" + age + ", department=" + department + "]";
	}
	
	
}