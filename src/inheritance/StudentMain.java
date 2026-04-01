package inheritance;

public class StudentMain {
	public static void main(String[] args) {
		Result r1 = new Result("Bhawani shankar", 12, 85, 75);
		r1.displayDetails();
		r1.calculateGrade();
		r1.calculateResult();
	}
}

class Students{
	String name;
	int id;
	public Students(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	public void displayDetails() {
		System.out.println("Name: "+name);
		System.out.println("Id: "+id);
	}
}

class Marks extends Students{
	double marks;

	public Marks(String name, int id, double marks) {
		super(name, id);
		this.marks = marks;
	}
	
	public void calculateGrade() {
		if(marks>=80) System.out.println("Grade: A");
		else if(marks>=60) System.out.println("Grade: B");
		else System.out.println("Grade: C");
	}
}

class Result extends Marks{
	double attendance;

	public Result(String name, int id, double marks, double attendance) {
		super(name, id, marks);
		this.attendance = attendance;
	}
	
	public void calculateResult() {
		if(attendance>=75) System.out.println("Pass");
		else System.out.println("Fail");
	}
}