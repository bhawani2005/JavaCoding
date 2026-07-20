package threadPrograms;

public class ThreadYield {
	public static void main(String[] args) {
		myThreadYield t1 = new myThreadYield();
		t1.start();
		
		for(int i=0; i<=5; i++) {
			System.out.println("Hiii");
			try {
				Thread.sleep(1000);//I'm willing to pause here if another thread of the same priority wants to run.
			}
			catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
		
	}
}

class myThreadYield extends Thread{
	public void run() {
		for(int i=0; i<=5; i++) {
			System.out.println("Hello");
			Thread.yield();
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}