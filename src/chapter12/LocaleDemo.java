package chapter12;

import java.util.Arrays;
import java.util.Locale;

public class LocaleDemo {

    public static void main(String[] args) {
        Locale defaultLocale = Locale.getDefault();
        System.out.println("Default locale: " + defaultLocale);

        System.out.println("Language: " + defaultLocale.getLanguage());
        System.out.println("Display Language: " + defaultLocale.getDisplayLanguage());
        System.out.println("Country: " + defaultLocale.getCountry());
        System.out.println("Display Country: " + defaultLocale.getDisplayCountry());

        Locale newLocale = new Locale("fr", "FR");
        Locale.setDefault(newLocale);
        System.out.println("New Default Locale: " + Locale.getDefault());

        //by calling constructor
        Locale locale1 = new Locale("en");
        Locale locale2 = new Locale("fr", "FR");
        Locale locale3 = new Locale("de", "DE");

        System.out.println("locale1: " + locale1);
        System.out.println("locale2: " + locale2);
        System.out.println("locale3: " + locale3);

        //by using built in constants
        Locale localeUS = Locale.US;
        Locale localeUK = Locale.UK;
        Locale localeCANADA = Locale.CANADA;

        System.out.println(localeUS);
        System.out.println(localeUK);
        System.out.println(localeCANADA);

        Locale l = new Locale.Builder()
                .setLanguage("ja")
                .setRegion("JP")
                .build();
        System.out.println(l);

        System.out.println("=================================");
        Locale [] locales = Locale.getAvailableLocales();
        Arrays.stream(locales)
                .forEach(System.out::println);
    }
}
