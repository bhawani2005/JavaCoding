package threadPrograms;

public class ThreadSleep {
	public static void main(String[] args) {
		ThreadSleep1 t = new ThreadSleep1();
		
		t.start();
	}
}

class ThreadSleep1 extends Thread{
	public void run() {
		for(int i=0; i<=5; i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}