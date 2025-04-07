package chapter10;

import java.util.concurrent.locks.ReentrantLock;

public class StarvationDemo {
    private static final ReentrantLock lock = new ReentrantLock(true);
    /*ReentrantLock(true) uses fair locking (FIFO order).
    This is crucial—it helps avoid starvation by ensuring that
    threads acquire the lock in the order they requested it.
     */

    public static void main(String[] args) {
        Runnable runnable = () -> {
            while (true) {
                if (lock.tryLock()) {
                    try {
                        System.out.println(Thread.currentThread().getName() + " acquired lock.");
                        try {
                            Thread.sleep(500);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    } finally {
                        lock.unlock();
                    }
                }
            }
        };
        /*Each thread loops infinitely, trying to get the lock
        If successful, it sleeps for 500ms to simulate some work.
        Then releases the lock and loops again.*/

        Thread highPriority = new Thread(runnable, "High priority thread");
        Thread lowPriority = new Thread(runnable, "Low priority thread");
        highPriority.start();
        lowPriority.start();
    }
}
