package chapter5;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.function.Predicate;

public class FilterETExample {
    public static void main (String[] args) {
        List<String> li = Arrays.asList("pen", "is","not","a", "pencil");
        Predicate<String> test = s -> {
            int i = 0;
            boolean result = s.contains("pen");
            System.out.print(i++ + ":");
            return result;
        };

        li.stream().filter(test).findFirst().ifPresent(System.out::println);
        //0:pen
    }
}
