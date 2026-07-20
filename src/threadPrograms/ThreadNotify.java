package threadPrograms;

public class ThreadNotify {
	public static void main(String[] args) throws InterruptedException {
		ThreadNotify1 t = new ThreadNotify1();
		
		t.start();
		//Thread.sleep(8000); //this line occure the deadlock because ThreadNotify1 notifying before the main gone wait
		synchronized (t) {
			System.out.println("Mainthread waiting until thread 01 will executed...");
			t.wait();
			//Thread.currentThread().wait(); //this line also occure the deadlock because main thread wait until main thread notify it self...
		}
		try {
			for(int i=0; i<=5; i++) {
				System.out.println("Hello");
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	
}


class ThreadNotify1 extends Thread{
	public void run() {
		try {
			for(int i=0; i<=5; i++) {
				System.out.println("Bye");
				Thread.sleep(1000);
			}
			synchronized (this) {
				System.out.println("Thread 01 Notifing the Waiting thread...");
				this.notifyAll();
			}
			for(int i=0; i<=5; i++) {
				System.out.println("hii");
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}
}