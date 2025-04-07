package chapter12;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleDemo {

    public static void main(String[] args) {
        //defining locales
        Locale localeUS = new Locale("en", "US");
        Locale localeFR = new Locale("fr", "FR");
        Locale localeES = new Locale("es", "ES");

        //load and display message
        printMessage(localeUS);
        printMessage(localeFR);
        printMessage(localeES);
    }

    public static void printMessage(Locale locale) {
        ResourceBundle bundle = ResourceBundle.getBundle("chapter12.Message", locale);
        System.out.println("Locale: " + locale);
        System.out.println("Greeting: " + bundle.getString("greeting"));
        System.out.println("Farewell: " + bundle.getString("farewell"));
        System.out.println("Language: " + bundle.getString("language"));
        System.out.println("============================");
    }
}
