package chapter5;

import java.util.Optional;

public class OptionalExample2 {
    public static void main(String[] args) {
        Optional<String> nonEmptyOptional = Optional.of("Hello World!!!");
        Optional<String> emptyOptional = Optional.empty();
        Optional<String> nullableOptional = Optional.ofNullable(null);
//        System.out.println("Non empty optional: " + nonEmptyOptional);
//        System.out.println("Empty optional: " + emptyOptional);
//        System.out.println("Nullable Optional optional: " + nullableOptional);

 // Checking if the non-empty Optional has a value
        if (nonEmptyOptional.isPresent()) {
//            System.out.println("Non-empty optional has value: " + nonEmptyOptional.get());
//        } else {
//            System.out.println("Non-empty optional is empty.");
        }

        // Using ifPresent to handle the value inside the Optional
//        nonEmptyOptional.ifPresent(value -> System.out.println("The value is: " + value));

        // Using orElse() to get default value
        String defaultValue = emptyOptional.orElse("Default value");
//        System.out.println("Value from empty optional or default:  " + defaultValue);

        //lazy way to get default value
        String defaultValueLazy = emptyOptional.orElseGet(() -> "Lazy default value");
//        System.out.println("Value from empty optional or lazy default:  " + defaultValueLazy);
//
         //orElseThrow() for exception handling
//        try {
//            String valueOrException = nullableOptional.orElseThrow(() -> new IllegalArgumentException("Value not present"));
//            System.out.println("Value or exception: " + valueOrException);
//        } catch (Exception e) {
//            System.out.println("Exception caught: " + e.getMessage());
//        }

        //Tranforming value of Optional object from Hello World to HELLO WORLD
//        Optional<String> transformValue = nonEmptyOptional.map(String::toUpperCase);
//        System.out.println("Transformed value: " + transformValue.orElse("No transformation"));

        //flatMap(), what is the difference between these 2?
        Optional<String> flatMappedValue = nonEmptyOptional.flatMap(value -> Optional.of(value+" -FlatMapExample"));
        System.out.println("Flat mapped value: " + flatMappedValue.orElse("No flat map"));


    }
}
