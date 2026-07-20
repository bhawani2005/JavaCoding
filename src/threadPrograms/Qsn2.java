package threadPrograms;

public class Qsn2 {
	public static void main(String[] args) throws InterruptedException {
		MyRunnable1 r = new MyRunnable1();
		
		Thread t = new Thread(r);
		t.start();
		t.join();
		System.out.println("Main Thread Executed...");
	}
}

class MyRunnable1 implements Runnable{
	public void run() {
		for(int i=1; i<=10; i++) {
			System.out.println(7*i);
		}
	}
}
