package chapter4;

import java.util.function.Supplier;

public class SupplierDemo2 {
    public static void main(String[] args) {
        String userInput = null;

        Supplier<String> defaultSupplier = () -> "Default value";

        //Using ternary operator to get and print the output
        String result = (userInput != null) ? userInput : defaultSupplier.get();

        System.out.println("Result: " + result);
        //Result: Default value
    }
}
