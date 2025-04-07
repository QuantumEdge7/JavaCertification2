package chapter10;

public class ThreadGroupDemo implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        ThreadGroupDemo obj = new ThreadGroupDemo();
        ThreadGroup tg1 = new ThreadGroup("Parent ThreadGroup");

        Thread t1 = new Thread(tg1, obj, "One");
        t1.start();
        Thread t2 = new Thread(tg1, obj, "two");
        t2.start();
        Thread t3 = new Thread(tg1, obj, "three");
        t3.start();
        System.out.println("Thread group name: " + tg1.getName());
        tg1.list();
    }
}
