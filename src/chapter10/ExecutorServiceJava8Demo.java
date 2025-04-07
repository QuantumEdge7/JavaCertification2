package chapter10;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.IntStream;

public class ExecutorServiceJava8Demo {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        List<Callable<String>> tasks = new ArrayList<>();

     /*Using Javsa 8*/   IntStream.rangeClosed(1, 5).forEach(i ->
                tasks.add(() -> {
                    Thread.sleep(1000);
                    return "Task " + i + " completed by " + Thread.currentThread().getName();
                })
        );
        try {
            List<Future<String>> results = executor.invokeAll(tasks);

            results.stream()
                    .map(future -> {
                        try {
                            return future.get();
                        } catch (InterruptedException | ExecutionException e) {
                            throw new RuntimeException(e);
                        }
                    })
                    .forEach(System.out::println);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            executor.shutdown();
        }
    }
}
