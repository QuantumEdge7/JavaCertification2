package chapter4;

public class BiSupplierDemoExample {

    public static void main(String[] args) {
        BiSupplierDemo<String, Integer, String> biSupplierDemo = (name, age) ->
                "Name: " + name + ", Age: " + age;
        String result = biSupplierDemo.get("Alice", 39);
        System.out.println(result); //Name: Alice, Age: 39
    }
}
