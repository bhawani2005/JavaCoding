package interface_code;

public class InterfaceIntro {
	public static void main(String[] args) {
		
	}
}

interface Animal{
	double PI = 3.14; //in interface all variable are by default public, static and final.
	void eat();  // in interface all method by default public and abstract.
	public static void run() {
		System.out.println("Run fast");
	}
	
	public default void jump() {
		System.out.println("Run fast");
	}
}
