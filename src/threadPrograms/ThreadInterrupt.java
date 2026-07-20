package threadPrograms;


public class ThreadInterrupt {
	public static void main(String[] args) {
		MyThread1 t = new MyThread1();
		t.start();
		t.interrupt();
		
		for(int i=1; i<=5; i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}


class MyThread1 extends Thread{
	
	public void run() {
		try {
			for(int i=1; i<=5; i++) {
				System.out.println("Thread-0");
				Thread.sleep(3000);
			}
		}
		catch (InterruptedException e) {
			System.out.println("Thread is Intrrupted.");
		}
	}
}