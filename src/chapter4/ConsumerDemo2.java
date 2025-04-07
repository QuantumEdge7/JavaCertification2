package chapter4;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo2 {
    public static void main(String[] args) {
        List<String> items = List.of("Apple", "Banana", "Cherry");

        //Appending a suffix for each string in list
        Consumer<String> appendSuffix = item -> System.out.println(item+ " (fruit)");
        items.forEach(appendSuffix);

       /*Apple (fruit)
         Banana (fruit)
         Cherry (fruit) */
    }
}
