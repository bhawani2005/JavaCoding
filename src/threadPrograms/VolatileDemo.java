package threadPrograms;

public class VolatileDemo {
	static volatile boolean stop = false;
	public static void main(String[] args) {
		Thread t1 = new Thread(()->{
			for(int i=1; i<=5; i++) {
				if(stop) {
					System.out.println("Thread-01 stopped");
					break;
				}
				try {
					System.out.println("Hello");
					Thread.sleep(1000);
				}
				catch(InterruptedException e) {
					System.out.println(e.getMessage());
				}
			}
		});
		
		Thread t2 = new Thread(()->{
			for(int i=1; i<=5; i++) {
				try {
					System.out.println("Hii");
					Thread.sleep(500);
				}
				catch(InterruptedException e) {
					System.out.println(e.getMessage());
				}
			}
			
			stop = true;
		});
		
		t1.start();
		t2.start();
	}
}
