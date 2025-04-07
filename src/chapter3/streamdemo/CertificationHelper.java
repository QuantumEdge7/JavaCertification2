package chapter3.streamdemo;

public class CertificationHelper {

    public static String getCertificationName(String base) {
        return base.toUpperCase();
    }

    public static String addSuffix(String name) {
        return name + " Certification";
    }
}
