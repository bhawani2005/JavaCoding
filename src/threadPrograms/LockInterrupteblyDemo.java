package threadPrograms;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockInterrupteblyDemo {

    public static Lock lock = new ReentrantLock();

    static class MyThread1 extends Thread {
        public void run() {
            try {
                lock.lock();
                System.out.println(Thread.currentThread().getName() + " got the lock.");
                System.out.println(Thread.currentThread().getName() + " is started the execution.");
                Thread.sleep(5000);
                System.out.println(Thread.currentThread().getName() + " is finished the execution.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.println(Thread.currentThread().getName() + " is releasing the lock.");
                lock.unlock();
            }
        }
    }

    static class MyThread2 extends Thread {
        public void run() {
            try {
                if (lock.tryLock(1, TimeUnit.SECONDS)) {
                    System.out.println(Thread.currentThread().getName() + " got the lock.");
                    try {
                        System.out.println(Thread.currentThread().getName() + " is started the execution.");
                        Thread.sleep(3000);
                        System.out.println(Thread.currentThread().getName() + " is finished the execution.");
                    } finally {
                        System.out.println(Thread.currentThread().getName() + " is releasing the lock.");
                        lock.unlock();
                    }
                } else {
                    System.out.println(Thread.currentThread().getName() + " couldn't acquire the lock...");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {

        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();

        t1.start();
        t2.start();
    }
}