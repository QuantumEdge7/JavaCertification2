package chapter10;

public class ThreadDemo6 extends Thread {

    @Override
    public void run() {
        System.out.println(
                Thread.currentThread().getState()
                        +" "+
                        Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        ThreadDemo6 t1 = new ThreadDemo6();
        ThreadDemo6 t2 = new ThreadDemo6();
        ThreadDemo6 t3 = new ThreadDemo6();
        t1.start();
        t2.start();
        t3.start();
    }
}
