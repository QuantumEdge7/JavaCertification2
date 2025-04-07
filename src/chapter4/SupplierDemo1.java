package chapter4;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierDemo1 {
    public static void main(String[] args) {
        Supplier<Double> randomValue = Math::random;
//        System.out.println(randomValue.get()); //0.9632601755726891

        Supplier<String> lazyMessage = () -> "Hello, world!!!";
        System.out.println(lazyMessage.get()); //Hello world!!!

        //Generating random numbers
        Random random = new Random();
        Supplier<Integer> randomNumber = random::nextInt;
        for (int i = 0; i < 5; i++) {
            System.out.println(randomNumber.get());
        }
    }
}
