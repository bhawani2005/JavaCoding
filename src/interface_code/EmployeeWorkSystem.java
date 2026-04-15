package interface_code;

public class EmployeeWorkSystem {
	public static void main(String[] args) {
		Developer d = new Developer();
		d.work();
		d.getSalary();
		
		Tester t = new Tester();
		t.work();
		t.getSalary();
		
		TeamLead tl = new TeamLead();
		tl.work();
		tl.getSalary();
		tl.manageTeam();
	}
}

interface Requirement{
	void work();
	void getSalary();
}

interface AdditionalRequirement{
	void manageTeam();
}

class Developer implements Requirement{
	public void work() {
		System.out.println("Developer develop a software");
	}
	
	public void getSalary() {
		System.out.println("Developer get their Salary...");
	}
}

class Tester implements Requirement{
	public void work() {
		System.out.println("Tester is tasting a software");
	}
	
	public void getSalary() {
		System.out.println("Tester get their Salary...");
	}
}

class TeamLead implements Requirement, AdditionalRequirement{
	public void work() {
		System.out.println("Team Leader lead the whole project");
	}
	
	public void getSalary() {
		System.out.println("Team Leader get their Salary...");
	}
	
	public void manageTeam() {
		System.out.println("Team Leader Lead his Team.");
	}
}