package chapter10;

import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierDemo {
    public static void main(String[] args) {
        final int numWorkers = 3;
        CyclicBarrier barrier = new CyclicBarrier(numWorkers, () ->
                System.out.println("All workers have reached the barrier. Proceeding to next task.")
        );

        for (int i = 0; i < numWorkers; i++) {
            new Worker(barrier, i + 1).start();
        }
    }
}
