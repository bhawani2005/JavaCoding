package threadPrograms;

public class ThreadDeadlock {
	public static void main(String[] args) {
		MyThreadJoin11 t1 = new MyThreadJoin11();
		MyThreadJoin22 t2 = new MyThreadJoin22();
		
		t1.setThread(t2);
		t2.setThread(t1);
		
		t1.start();
		t2.start();
		
		//In this situation deadlock occur.
	}
}

class MyThreadJoin11 extends Thread{
	MyThreadJoin22 t;

	public void setThread(MyThreadJoin22 t) {
		this.t = t;
	}
	
	public void run() {
		try {
			System.out.println("Thread 01 waits for thread 2 to finish");
			t.join();
			for(int i=0; i<=5; i++) {
				System.out.println("Thread-01");
			}
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class MyThreadJoin22 extends Thread{
	MyThreadJoin11 t;

	public void setThread(MyThreadJoin11 t) {
		this.t = t;
	}
	
	public void run() {
		try {
			System.out.println("Thread 02 waits for thread 1 to finish");
			t.join();
			for(int i=0; i<=5; i++) {
				System.out.println("Thread-01");
			}
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}