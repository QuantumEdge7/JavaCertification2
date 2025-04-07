package chapter10;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;

public class ForkJoinDemo2 {

    public static void main(String[] args) {
        int[] array = new int[20];
        Arrays.fill(array, 5);

        System.out.println("Before increment: " + Arrays.toString(array));

        ForkJoinPool forkJoinPool = new ForkJoinPool();
        IncrementTask task = new IncrementTask(array, 0, array.length);

        forkJoinPool.invoke(task);

        System.out.println("After increment: " + Arrays.toString(array));
    }
}
