package chapter10;

public class RaceConditionDemo {
    private static int counter = 0;

    public static void main(String[] args) {
        Runnable incrementTask = () -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println(i);
                counter++;
            }
        };
        Thread thread1 = new Thread(incrementTask);
        Thread thread2 = new Thread(incrementTask);

        thread1.start();
        thread2.start();

        try {
            System.out.println("Counter value before join: " + counter);
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Final counter value: " + counter);
        }
    }
}
