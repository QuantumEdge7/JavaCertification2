package chapter6;

public class Person {
    private int age;

    public Person(int age) {
        assert age > 0 : "Age must be positive";
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
