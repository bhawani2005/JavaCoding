package classAndObject;

public class StudentMain {
	public static void main(String[] args) {
		Student1 s1 = new Student1();
		s1.name="BhawaniShankar";
		s1.mark1=85;
		s1.mark2=65;
		s1.mark3=96;
		
		s1.displayResult();
		System.out.println("Total Mark is : "+s1.calculateTotal());
		System.out.println("Average Mark is: "+s1.calculateAverage());
	}
}

class Student1{
	String name;
	int mark1, mark2, mark3;
	
	public int calculateTotal() {
		return mark1+mark2+mark3;
	}
	
	public int calculateAverage() {
		return (mark1+mark2+mark3)/3;
	}
	
	public void displayResult() {
		System.out.println("Name: "+name);
		System.out.println("Subject1: "+mark1);
		System.out.println("Subject2: "+mark2);
		System.out.println("Subject3: "+mark3);
	}
}
