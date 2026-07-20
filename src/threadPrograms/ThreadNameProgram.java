package threadPrograms;

public class ThreadNameProgram {
	public static void main(String[] args) {
		Thread.currentThread().setName("Rahul");
		System.out.println(Thread.currentThread().getName());
	}
}
