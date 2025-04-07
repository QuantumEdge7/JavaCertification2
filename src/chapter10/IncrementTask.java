package chapter10;

import java.util.concurrent.RecursiveAction;

public class IncrementTask extends RecursiveAction {

    private static final int THRESHOLD = 10;
    private int[] array;
    private int start, end;


    public IncrementTask(int[] array, int start, int end) {
        this.array = array;
        this.start = start;
        this.end = end;
    }

    @Override
    protected void compute() {
        if ((end - start) <= THRESHOLD) {
            long sum = 0;
            for (int i = start; i < end; i++) {
                array[i] += 1;
            }
        } else {
            int mid = start + (end - start) / 2;
            IncrementTask leftTask = new IncrementTask(array, start, mid);
            IncrementTask rightTask = new IncrementTask(array, mid, end);

            invokeAll(leftTask, rightTask);
        }
    }
}
