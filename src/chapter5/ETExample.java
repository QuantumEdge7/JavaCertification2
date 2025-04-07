package chapter5;

import java.util.Arrays;
import java.util.List;

public class ETExample {
    public static void main(String[] args) {
        List<String> empDetails = Arrays.asList(
                "100, Robin, HR",
                "200, Mary, AdminServices",
                "101, Peter, HR"
        );

        empDetails.stream()
                .filter(s -> s.contains("r"))
                .sorted()
                .forEach(System.out::println);
        //101, Peter, HR
        //200, Mary, AdminServices
    }
}

