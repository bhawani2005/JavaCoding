package threadPrograms;


public class ThreadSynchronized {
	public static void main(String[] args) {
		Bathroom b = new Bathroom();
		
		Ankit ankit = new Ankit(b);
		Hemanta hemanta = new Hemanta(b);
		
		ankit.start();
		hemanta.start();
	}
}


class Bathroom{
	
	synchronized void bathroomProcess(String name) {
		enterRoom(name);
		takeBath(name);
		exitRoom(name);
		
	}
	
	void enterRoom(String name) {
		System.out.println(name+" entered bathroom");
	}
	void takeBath(String name) {
		System.out.println(name+" taked bath");
	}
	void exitRoom(String name) {
		System.out.println(name+" exit from bathroom");
	}
}

class Ankit extends Thread{
	Bathroom b;

	public Ankit(Bathroom b) {
		this.b = b;
	}
	
	public void run() {
		b.bathroomProcess("Ankit");
	}
}

class Hemanta extends Thread{
	Bathroom b;

	public Hemanta(Bathroom b) {
		this.b = b;
	}
	
	public void run() {
		b.bathroomProcess("Hemanta");
	}
}