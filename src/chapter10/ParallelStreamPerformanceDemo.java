package chapter10;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ParallelStreamPerformanceDemo {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 1_000_000; i++) {
            numbers.add(random.nextInt(1000));
        }

        long start = System.currentTimeMillis();
        long countSequential = numbers.stream().filter(n -> n > 500).count();
        System.out.println(countSequential);
        long end = System.currentTimeMillis();
        System.out.println("Sequential Stream time: " + (end - start) + " ms");

        start = System.currentTimeMillis();
        long countParallel = numbers.parallelStream().filter(n -> n > 500).count();
        System.out.println(countParallel);
        end = System.currentTimeMillis();
        System.out.println("Parallel stream time: " + (end - start) + " ms");
    }
}
