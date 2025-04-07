package chapter10;

public class ThreadDemo4 extends Thread {

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.print(i);//123412345123545
            }
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        ThreadDemo4 t1 = new ThreadDemo4();
        ThreadDemo4 t2 = new ThreadDemo4();
        ThreadDemo4 t3 = new ThreadDemo4();
        t1.start();
        t2.start();
        t3.start();
    }
}
