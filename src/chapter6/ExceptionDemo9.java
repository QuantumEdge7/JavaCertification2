package chapter6;

public class ExceptionDemo9 {

    public static void main(String[] args) {
        vote(8);
        System.out.println("end");
    }

    public static void vote(int age) {
        if (age >= 18) {
            System.out.println("you can vote.");
        } else {
            System.out.println("you can not vote.");
//            InvalidAgeException ae = new InvalidAgeException("you can not vote.");
//            throw ae;
            throw  new InvalidAgeException("you can not vote.");
        }
    }
}
