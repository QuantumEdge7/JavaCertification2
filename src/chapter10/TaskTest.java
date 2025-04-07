package chapter10;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TaskTest {
    public static void main(String[] args) {
        Runnable task1 = new Task("Task1");
        Runnable task2 = new Task("Task2");
        Runnable task3 = new Task("Task3");
        Runnable task4 = new Task("Task4");
        Runnable task5 = new Task("Task5");

        ExecutorService executor = Executors.newFixedThreadPool(3);
        executor.execute(task1);
        executor.execute(task2);
        executor.execute(task3);
        executor.execute(task4);
        executor.execute(task5);
        executor.shutdown();
    }
}
