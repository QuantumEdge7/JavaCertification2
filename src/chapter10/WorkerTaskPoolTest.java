package chapter10;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class WorkerTaskPoolTest {

    public static void main(String[] args) {
        ExecutorService executor =
                Executors.newFixedThreadPool(3);


        List<Future<String>> futures = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            WorkerTask task = new WorkerTask(i);
            Future<String> future = executor.submit(task);
            futures.add(future);
        }

        for (Future<String> future : futures) {
            try {
                System.out.println(future.get());
            } catch (InterruptedException | ExecutionException e) {
                throw new RuntimeException(e);
            }
        }

        executor.shutdown();
    }
}
