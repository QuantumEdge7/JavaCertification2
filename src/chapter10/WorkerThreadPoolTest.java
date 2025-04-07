package chapter10;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class WorkerThreadPoolTest {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            Runnable worked = new WorkerThread(" "+i);
            service.execute(worked);
        }
        service.shutdown();
        while(!service.isTerminated()){

        }
        System.out.println("Finished all threads.");

    }
}
