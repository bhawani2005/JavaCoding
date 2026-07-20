package threadPrograms;

public class ThreadJoin {
	public static void main(String[] args) {
		MyThreadJoin2 t2 = new MyThreadJoin2();
		MyThreadJoin1 t1 = new MyThreadJoin1(t2);
		
		t1.start();
		t2.start();
	}
}

class MyThreadJoin1 extends Thread{
	MyThreadJoin2 t;

	public MyThreadJoin1(MyThreadJoin2 t) {
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

class MyThreadJoin2 extends Thread{
	public void run() {
		for(int i=0; i<=5; i++) {
			System.out.println("Thread-02");
		}
	}
}