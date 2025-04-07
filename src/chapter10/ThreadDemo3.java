package chapter10;

public class ThreadDemo3 {
    public static void main(String[] args) {
//        Thread t1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Hello from thread.");
//            }
//        });

        Thread t2 = new Thread(() -> System.out.println("Hello from thread"));
        Thread t3 = new Thread(() -> System.out.println("Hello from thread"));

//        t1.start();
        t2.start();
        t3.start();

    }
}
