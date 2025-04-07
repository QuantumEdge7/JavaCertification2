package chapter6;

public class AssertionExample {
    public static void main(String[] args) {
        int age = 28;
//        if(age >=18){
//            System.out.println("Age is valid: " + age);
//        }
        assert age >= 18: "Age must be at least 18"; // using assert instead of if block
        System.out.println("Age is valid: " + age);

    }
}
