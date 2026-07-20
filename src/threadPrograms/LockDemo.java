package threadPrograms;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockDemo {
	public static Lock lock = new ReentrantLock();
	
	static class MyThread extends Thread{
		public void run() {
			lock.lock();
			System.out.println(Thread.currentThread().getName()+" got the lock.");
			try {
				System.out.println(Thread.currentThread().getName()+" is started the execution.");
				Thread.sleep(3000);
				System.out.println(Thread.currentThread().getName()+" is finished the execution.");
			}
			catch(InterruptedException e) {
				System.out.println(e);
			}
			finally {
				System.out.println(Thread.currentThread().getName()+" is releasing the execution.");
				lock.unlock();
			}
		}
	}
	
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();

		
		t1.start();
		t2.start();
	}
}
