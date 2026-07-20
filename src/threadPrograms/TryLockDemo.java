package threadPrograms;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TryLockDemo {
	public static Lock lock = new ReentrantLock();
	
	static class MyThread extends Thread{
		public void run() {
			try {
				if(lock.tryLock(1,TimeUnit.SECONDS)) {
					System.out.println(Thread.currentThread().getName()+" got the lock.");
					try {
						System.out.println(Thread.currentThread().getName()+" is started the execution.");
						Thread.sleep(3000);
						System.out.println(Thread.currentThread().getName()+" is finished the execution.");
					}
					finally {
						System.out.println(Thread.currentThread().getName()+" is releasing the execution.");
						lock.unlock();
					}
				}
				else {
					System.out.println(Thread.currentThread().getName()+" couldn't aquire the look...");
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
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
