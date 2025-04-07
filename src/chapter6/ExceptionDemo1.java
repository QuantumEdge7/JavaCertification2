package chapter6;

import java.util.Scanner;

//few examples of exception occurrence
public class ExceptionDemo1 {

    public static void main(String[] args) {
        int[] arr = new int[2]; //size of array is 2
        arr[0] = 10;
        arr[1] = 20;
        //arr[2] = 30; //gives ArrayIndexOutOfBoundsException
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }

        String str = null;
//        System.out.println(str.toUpperCase());//gives NullPointerException

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = input.nextInt();//gives InputMismatchException if we do not pass an int value
        int b = 1;

        String s = "12t";
//        int i = Integer.parseInt(s); //converting String to int
//        System.out.println(i);//give NumberFormatException


    }
}
