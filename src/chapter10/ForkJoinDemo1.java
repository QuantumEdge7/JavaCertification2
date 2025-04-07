package chapter10;

import java.util.concurrent.ForkJoinPool;

public class ForkJoinDemo1 {
    public static void main(String[] args) {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        ForkJoinPool forkJoinPool = new ForkJoinPool();

        SumTask task = new SumTask(array, 0, array.length);
        long result = forkJoinPool.invoke(task);
        System.out.println("Sum of array: " + result);
    }
}
