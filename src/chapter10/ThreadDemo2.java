package chapter10;

public class ThreadDemo2 implements Runnable {

    @Override
    public void run() {
        System.out.println("Hello from thread demo.");
    }

    public static void main(String[] args) {
        ThreadDemo2 th1 = new ThreadDemo2();
        ThreadDemo2 th2 = new ThreadDemo2();
        ThreadDemo2 th3 = new ThreadDemo2();

        //there is no start() method in Runnable,
        //so we have to create instance of Thread class
        Thread t1 = new Thread(th1);
        Thread t2 = new Thread(th2);
        Thread t3 = new Thread(th3);
        t1.start();
        t2.start();
        t3.start();
    }
}
