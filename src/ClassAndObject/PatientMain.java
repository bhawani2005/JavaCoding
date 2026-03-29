package classAndObject;

public class PatientMain {
	public static void main(String[] args) {
		Patient p1 = new Patient();
		p1.name="Balram";
		p1.age=65;
		p1.disease="fever";
		p1.displayPatientInfo();
		p1.checkCritical();
		
	}
}


class Patient{
	String name; 
	int age;
	String disease;
	
	public void displayPatientInfo() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Disease: "+disease);
	}
	
	public void checkCritical() {
		if(age>60) {
			System.out.println("High Risk Patient..");
		}
	}
}