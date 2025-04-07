package chapter8;

import java.util.Scanner;

public class FormattedOutputDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter product name: ");
        String productName = scanner.nextLine();

        System.out.println("Enter product price: ");
        double price = scanner.nextDouble();

        System.out.printf("The price of %s is %.2f%n", productName, price);
    }
}
