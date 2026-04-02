package inheritance;

public class HospitalSystemMain {
	public static void main(String[] args) {
		Doctor d1 = new Doctor("Dr. Anjan", 502, 2800);
		d1.displayDetails();
		d1.login();
		d1.logout();
		
		System.out.println("---------------------------------------");
		
		Surgeon s1 = new Surgeon("Dr. Raja", 605, 1500, 5000);
		s1.displayDetails();
		s1.login();
		s1.logout();
		s1.calculateTotalFee();
		
		System.out.println("---------------------------------------");
		
		Nurse n1 = new Nurse("Ruchika", 901, "Genral", "Day");
		n1.displayDetails();
		n1.login();
		n1.logout();
		n1.assistDoctor();
	}
}

class Hospital{
	String name;
	int id;
	
	public Hospital(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	public void displayDetails() {
		System.out.println("Name: "+name);
		System.out.println("Id: "+id);
	}
	
	public void login() {
		System.out.println("Loged in...");
	}
	
	public void logout() {
		System.out.println("Loged out...");
	}
}

class Doctor extends Hospital{
	double consultationFee;
	
	public Doctor(String name, int id, double consultationFee) {
		super(name, id);
		this.consultationFee = consultationFee;
	}
	
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Consultation Fee: "+consultationFee);
	}
}

class Surgeon extends Doctor{
	double surgeryCharge;
	
	public Surgeon(String name, int id, double consultationFee, double surgeryCharge) {
		super(name, id, consultationFee);
		this.surgeryCharge = surgeryCharge;
	}
	
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Surgery Charge: "+surgeryCharge);
	}
	
	public void calculateTotalFee() {
		System.out.println("Total Fee: "+(consultationFee+surgeryCharge));
	}
}

class Nurse extends Hospital{
	String department;
	String shift;
	
	public Nurse(String name, int id, String department, String shift) {
		super(name, id);
		this.department = department;
		this.shift = shift;
	}
	
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Department: "+department);
		System.out.println("Shift: "+shift);
	}
	
	public void assistDoctor() {
		System.out.println("Nurse is Assist to Doctor...");
	}
}