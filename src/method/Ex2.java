package method;

public class Ex2 {

	public static void main(String[] args) {
		jump();
	}
	
	public static void run() {
		System.out.println("Run first...");
	}
	
	public static void jump() {
		System.out.println("Jump high.....");
		run();
	}
}
