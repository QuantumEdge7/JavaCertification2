package chapter6;

import java.io.IOException;

public class ChildException extends Parent {
    //rule 1: if the super class method does not throw an exception,
    //subclass overridden method can not throw checked exception
//    void showMessage() throws IOException {
//        System.out.println("parent");
//    }

    //rule 2: if the super class method does not throw an exception,
    //subclass overridden method can not throw checked exception
    //but can throw unchecked exception
    void showMessage() throws ArithmeticException {
        System.out.println("parent");
    }

    //rule 3: if the superclass method declares an exception,
    //subclass overridden method can declare same ,
    //subclass exception or no exception but can not throws Exception
//    void displayMessage()  {
//        System.out.println("parent");
//    }

    void displayMessage() throws ArithmeticException {
        System.out.println("parent");
    }

    //subclass overridden method declares parent exception
//    void displayMessage() throws Exception {
//        System.out.println("parent");
//    }


    //subclass overridden method can declare child exception
    void sayHello() throws ArithmeticException{
        System.out.println("parent");
    }

    //subclass overridden method declares same exception
    void sayHi() throws Exception {
        System.out.println("parent");
    }
}
