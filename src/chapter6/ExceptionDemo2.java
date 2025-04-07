package chapter6;

import java.util.Scanner;


//handling with try - catch
public class ExceptionDemo2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = input.nextInt();
        System.out.println("Enter b: ");
        int b = input.nextInt();
        try {
            System.out.println("try block starts");
            int div = divide(a, b);
            System.out.println("division is: " + div);
            System.out.println("try block ends");
        } catch (ArithmeticException ae) {
            System.out.println(" catch block starts");
        }

        System.out.println("End");
    }

    public static int divide(int a, int b) {
        return a / b;
    }
}

//try   => block {}
//catch  => block {}
//finally  => block {}
//throw  => statement
//throws  => clause