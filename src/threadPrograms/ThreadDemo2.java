package threadPrograms;

public class ThreadDemo2 {
	public static void main(String[] args) {
		
		Thread t = new MyThread();
		t.start();
		
		for(int i=1; i<=5; i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class MyThread extends Thread{

	@Override
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println("Byy");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}