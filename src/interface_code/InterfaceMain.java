package interface_code;

public class InterfaceMain {
	
}

interface A{
	
//	type of method allow by the interface
	
	public abstract void run();
	
	void listenMusic();		//no problem because in interface by default public and static
	
	public default void run1() {
		System.out.println("Hello");
	}
	
	public static void jump() {
		System.out.println("Bye");
	}
	
	private static void sit() {
		System.out.println("Sit straight.");
	}
	
	
}

class B implements A{

	@Override
	public void run() {
		System.out.println("Disco dance");
		
	}

	@Override
	public void listenMusic() {
		System.out.println("Listening melody song");
		
	}
	
}
