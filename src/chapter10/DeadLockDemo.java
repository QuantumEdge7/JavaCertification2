package chapter10;

public class DeadLockDemo {
    private static final Object resource1 = new Object();
    private static final Object resource2= new Object();
   // These are two shared objects that threads will try to lock.

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            synchronized (resource1) { // synchronized block
                System.out.println("Thread 1: Locked resource1");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (resource2){
                    System.out.println("Thread 1: Locked resource2");
                }
            }
        });
        //Thread 1: locks resource1 → waits for resource2

        Thread thread2 = new Thread(() -> {
            synchronized (resource2){
                System.out.println("Thread 2: Locked resource2");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (resource1){
                    System.out.println("Thread 2: Locked resource1");
                }
            }
        });
        //Thread 2: locks resource2 → waits for resource1
        thread1.start();
        thread2.start();
    }
}
