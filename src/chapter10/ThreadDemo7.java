package chapter10;

public class ThreadDemo7 extends Thread {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()
                + " " + Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
        ThreadDemo7 t1 = new ThreadDemo7();
        ThreadDemo7 t2 = new ThreadDemo7();
        ThreadDemo7 t3 = new ThreadDemo7();
        t1.setPriority(NORM_PRIORITY);
        t2.setPriority(MIN_PRIORITY);
        t3.setPriority(MAX_PRIORITY);
        t1.start(); //Thread-0 5
        t2.start(); //Thread-1 1
        t3.start(); //Thread-2 10
    }
}
