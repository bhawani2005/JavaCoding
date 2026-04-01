package inheritance;

public class CollegeMain {
	public static void main(String[] args) {
		Student1 s1 = new Student1("Bhawani Shankar", 12, "CSE", 96);
		s1.displayDetails();
		s1.writeExam();
		
		System.out.println("---------------------------------------------");
		
		Teacher t1 = new Teacher("Hemanta", 101, "EEE", 250000);
		t1.displayDetails();
		t1.teachClass();
		
		System.out.println("---------------------------------------------");
		
		Admin a1 = new Admin("Sourya", 201, "Admin", "Head Admin");
		a1.displayDetails();
		a1.manageSystem();
		
		System.out.println("---------------------------------------------");
		
		Librarian l1 = new Librarian("Sudip", 601, "CE", 250);
		l1.displayDetails();
		l1.issueBook();
	}
}

class College{
	String name;
	int id;
	String department;
	public College(String name, int id, String department) {
		this.name = name;
		this.id = id;
		this.department = department;
	}
	
	public void displayDetails() {
		System.out.println("Name: "+name);
		System.out.println("Id: "+id);
		System.out.println("Department: "+department);
	}
	
	public void login() {
		System.out.println("User Logged In..");
	}
	
	public void logout() {
		System.out.println("User logged Out..");
	}
}

class Student1 extends College {
	int mark;

	public Student1(String name, int id, String department, int mark) {
		super(name, id, department);
		this.mark = mark;
	}
	
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Mark: "+mark);
	}
	
	public void writeExam() {
		System.out.println("Student is Writing Exam.");
	}
}

class Teacher extends College{
	double salary;

	public Teacher(String name, int id, String department, double salary) {
		super(name, id, department);
		this.salary = salary;
	}
	
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Salary: "+salary);
	}
	
	public void teachClass() {
		System.out.println("Teacher is teaching class.");
	}
}

class Admin extends College{
	String role;

	public Admin(String name, int id, String department, String role) {
		super(name, id, department);
		this.role = role;
	}
	
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Role: "+role);
	}
	
	public void manageSystem() {
		System.out.println("Admin is Managing System.");
	}
}

class Librarian extends College{
	int booksHandled;

	public Librarian(String name, int id, String department, int booksHandled) {
		super(name, id, department);
		this.booksHandled = booksHandled;
	}
	
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Books Handled: "+booksHandled);
	}
	
	public void issueBook() {
		System.out.println("Librarian is issuing books.");
	}
	
}