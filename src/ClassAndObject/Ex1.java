package ClassAndObject;

class Student{
	public String name;
	public int age;
	public int id;
	public String courseApplied;
	
	public void displayInfo() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Id: "+id);
		System.out.println("Course Applied: "+courseApplied);
	}
}

public class Ex1 {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name="Ravi";
		s1.age=23;
		s1.id=501;
		s1.courseApplied="Java";
		Student s2 = new Student();
		s2.name="Ramu";
		s2.age=21;
		s2.id=502;
		s2.courseApplied="Python";
		
		s1.displayInfo();
		s2.displayInfo();
	}
}
