package logicalDesignPatternsInOpps_has_a_relation;

import java.util.ArrayList;
import java.util.List;



public class HospitalAndAppointmentSystem {
	public static void main(String[] args) {
		Patient p1 = new Patient("Ritun", "Fiver", 500);
		Patient p2 = new Patient("Ankit", "Cold", 300);
		
		Doctor d1 = new Doctor("Dr. Arun", "Madicen");
		Doctor d2 = new Doctor("Dr. Hemanta", "Surgon");
		
		List<Patient> patients = new ArrayList<>();
		patients.add(p1);
		patients.add(p2);
		
		List<Doctor> doctors = new ArrayList<>();
		doctors.add(d1);
		doctors.add(d2);
		
		Hospital h1 = new Hospital(patients, doctors);
		
		AppointmentSystem ap = new AppointmentSystem(h1);
		
		ap.bookAppointment(p1, d1);
	}
}	
	

class MedicalRecord{
	public String disease;
	public double treatmentCost;
	
	public MedicalRecord(String disease, double treatmentCost) {
		this.disease = disease;
		this.treatmentCost = treatmentCost;
	}
	
	public void displayRecord() {
		System.out.println("Disease: "+disease);
		System.out.println("Cost: "+treatmentCost);
	}
}

class Patient{
	private String name;
	private MedicalRecord record;
	
	public Patient(String name, String disease, double cost) {
		this.name = name;
		this.record = new MedicalRecord(disease, cost);
	}
	
	public MedicalRecord getRecord() {
		return record;
	}
	
	public String getName() {
		return name;
	}
	
}

class Doctor{
	public String name;
	public String specialization;
	
	public Doctor(String name, String specialization) {
		this.name = name;
		this.specialization = specialization;
	}
}

class Hospital{
	List<Patient> patients;
	List<Doctor> doctors;
	
	public Hospital(List<Patient> patients, List<Doctor> doctors) {
		this.patients = patients;
		this.doctors = doctors;
	}
} 

class AppointmentSystem{
	Hospital hospital;
	
	public AppointmentSystem(Hospital hospital) {
		this.hospital = hospital;
	}
	
	public void bookAppointment(Patient p, Doctor d) {
		System.out.println("Appointment Booked");
		p.getRecord().displayRecord();
		
	}
}